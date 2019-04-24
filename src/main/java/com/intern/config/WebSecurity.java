package com.intern.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class WebSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
				.usersByUsernameQuery("select username, password, active from user_detail where username=?")
				.authoritiesByUsernameQuery(
						"select ud.usename, ur.role from user_detail as ud, user_role as ur where "
								+ "ud.user_detail_id = ur.user_detail_id and username=?")

				.passwordEncoder(new BCryptPasswordEncoder());

	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/login").permitAll()
				.antMatchers("/home","/about").permitAll()
				.antMatchers("/admin/**").hasRole("ADMIN") // ROLE_ADMIN
				.antMatchers("/user/**").hasAnyRole("USER", "ADMIN") // USER_ROLE
				.and().
				formLogin().
				usernameParameter("username")
				.passwordParameter("password")
				.defaultSuccessUrl("/home")
				.failureUrl("/login?error=true")
				.permitAll()
				.and()
				.logout()
				.logoutSuccessUrl("/login?logout=true")
				.invalidateHttpSession(true)
				.permitAll()
				.and()
				.csrf()
				.disable();
	}
}
