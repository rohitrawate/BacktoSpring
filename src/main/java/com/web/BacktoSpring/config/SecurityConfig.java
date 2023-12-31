//package com.web.BacktoSpring.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/register", "/login").permitAll()
//                .antMatchers("/index").hasAnyRole("MEMBER, ADMIN")
//                .and().formLogin().loginPage("/login").permitAll()
//                .defaultSuccessUrl("/").and().logout().logoutSuccessUrl("/logout");
//    }
////}
//@Autowired
//private DataSource dataSource;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication().dataSource(dataSource)
//                .usersByUsernameQuery("select email as principal, password as credentails, true from member where email=?")
//                .authoritiesByUsernameQuery("select member_email as principal, role_name as role from member_roles where member_email=?")
//                .passwordEncoder(passwordEncoder()).rolePrefix("ROLE_");
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        // TODO Auto-generated method stub
//        return new BCryptPasswordEncoder();
//    }
//
//
//}
