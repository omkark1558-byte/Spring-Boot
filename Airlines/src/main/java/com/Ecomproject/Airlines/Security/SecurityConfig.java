package com.Ecomproject.Airlines.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain security(HttpSecurity request) {

		return request.csrf((i) -> {
			i.disable();
		}).authorizeHttpRequests((i) -> {
			i.requestMatchers(HttpMethod.GET).permitAll();
			i.requestMatchers(HttpMethod.POST).permitAll()
			.anyRequest()
			.authenticated();
			
		}).httpBasic(Customizer.withDefaults())
		.build();
	}
}
