package com.Ecomproject.Airlines.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	/*
	 * @Bean public SecurityFilterChain security(HttpSecurity http) throws Exception
	 * {
	 * 
	 * http .cors(cors -> {}) .csrf(csrf -> csrf.disable())
	 * .authorizeHttpRequests(auth -> auth .requestMatchers(HttpMethod.GET,
	 * "/**").permitAll() .requestMatchers(HttpMethod.POST, "/**").permitAll()
	 * .requestMatchers(HttpMethod.DELETE, "/**").permitAll()
	 * .anyRequest().authenticated() ); return http.build(); }
	 */
	
	@Bean
	public SecurityFilterChain securtiy(HttpSecurity re)
	{
		return re.csrf((i)->{i.disable();})
		.authorizeHttpRequests((i)->{i.requestMatchers(HttpMethod.GET).permitAll()
			.requestMatchers(HttpMethod.POST).permitAll()
		.anyRequest()
		.authenticated();}).httpBasic((i)->{})
		 .build();
	}
	
	@Bean
	public UserDetailsService myuser()
	{
		 UserDetails user1 = User.builder().username("adi").password("{noop}adi@123").build();
		 UserDetails user2 = User.builder().username("yashu").password("{noop}yashu@123").build();		 
		 return new InMemoryUserDetailsManager(user1,user2); 
	}

	 
}
