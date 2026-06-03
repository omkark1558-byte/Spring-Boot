package com.ecom.Aopllo_Hospital.security;

import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    private String SECRET =
    "mysecretkeymysecretkeymysecretkey";

    public String generateToken(String username)
    {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(
                 new Date(
                 System.currentTimeMillis()
                 + 86400000))
                .signWith(
                 Keys.hmacShaKeyFor(
                 SECRET.getBytes()),
                 SignatureAlgorithm.HS256)
                .compact();
    }

}