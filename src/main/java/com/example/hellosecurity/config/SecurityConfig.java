package com.example.hellosecurity.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.anyRequest().permitAll()
			.and()
			.logout()
				.deleteCookies("JSESSIONID")
				.logoutSuccessUrl("/")
			.and()
			.sessionManagement()
				.invalidSessionUrl("/sessionTimeout");
	}
}