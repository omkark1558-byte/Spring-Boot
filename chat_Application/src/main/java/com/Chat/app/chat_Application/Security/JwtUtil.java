package com.Chat.app.chat_Application.Security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import io.jsonwebtoken.security.Keys;

import java.security.Key;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    // Secret Key
    private static final String SECRET =
            "mysecretkeymysecretkeymysecretkey123456";

    // Generate key
    private final Key key =
            Keys.hmacShaKeyFor(SECRET.getBytes());



    // ====================================
    // Generate JWT Token
    // ====================================
    public String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)

                .setIssuedAt(new Date())

                .setExpiration(
                        new Date(System.currentTimeMillis() + 86400000)
                )

                .signWith(key, SignatureAlgorithm.HS256)

                .compact();
    }
}