package com.example.demoapp1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
            authorizeRequests()
                .antMatchers("/", "/user/**", "/field/**", "/response/**").permitAll();
        http.csrf().disable();
    }

    /*
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("admin@admin.com").password("admin").roles("ADMIN","USER");
        //auth.inMemoryAuthentication()
        if(authUsers != null) {
            for(Person userToAuth: authUsers) {
                auth.inMemoryAuthentication().withUser(userToAuth.getEmail()).password(userToAuth.getPassword()).roles("USER");
            }
        }
    } */
}