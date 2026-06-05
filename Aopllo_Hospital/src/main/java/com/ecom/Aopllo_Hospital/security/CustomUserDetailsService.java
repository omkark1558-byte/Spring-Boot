package com.ecom.Aopllo_Hospital.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ecom.Aopllo_Hospital.entity.User_entity;
import com.ecom.Aopllo_Hospital.repository.User_Repo;


@Service
public class CustomUserDetailsService implements UserDetailsService {

	private final User_Repo repo;

	public CustomUserDetailsService(User_Repo repo) {
		this.repo = repo;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User_entity entity = repo.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("Admin not found"));
		return User.builder().username(entity.getUsername()).password(entity.getPassword()).roles(entity.getRole())
				.build();
	}

}
