package com.ecommerce.ecommerce_pratice.Services;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class security_config {

//    @Bean
//    public SecurityFilterChain security(HttpSecurity http)
//    {
//        http.csrf((i)->{i.disable();})
//                .authorizeHttpRequests((i)->
//                        i.requestMatchers("/public").permitAll()
//                                .anyRequest()
//                                .authenticated())
//                .httpBasic(Customizer.withDefaults());
//             return http.build();
//    }


    @Bean
    public SecurityFilterChain security(HttpSecurity http)
    {
        http.csrf((i)->{i.disable();})
                .authorizeHttpRequests((i)->
                        i.requestMatchers("/public").permitAll()
                                .requestMatchers("/user/**").hasRole("USER")
                                .requestMatchers("/admin/**").hasRole("ADMIN")
                                .anyRequest()
                                .authenticated()
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }



    @Bean
    public UserDetailsService userservices()
    {
        UserDetails user = User.builder().username("adi").password("{noop}adi@123").roles("USER").build();
        UserDetails user2 = User.builder().username("omi").password("{noop}omi@123").roles("ADMIN").build();

        return new InMemoryUserDetailsManager(user,user2);
    }
}
