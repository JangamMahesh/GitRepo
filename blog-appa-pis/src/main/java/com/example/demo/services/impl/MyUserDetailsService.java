/*
 * package com.example.demo.services.impl;
 * 
 * import java.util.ArrayList;
 * 
 * import org.springframework.security.authentication.AuthenticationProvider;
 * import org.springframework.security.authentication.
 * UsernamePasswordAuthenticationToken; import
 * org.springframework.security.core.Authentication; import
 * org.springframework.security.core.AuthenticationException; import
 * org.springframework.security.core.userdetails.User; import
 * org.springframework.security.core.userdetails.UserDetails; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.core.userdetails.UsernameNotFoundException;
 * import org.springframework.stereotype.Service;
 * 
 * @Service public class MyUserDetailsService implements UserDetailsService,
 * AuthenticationProvider {
 * 
 * 
 * 
 * @Override public UserDetails loadUserByUsername(String username) throws
 * UsernameNotFoundException { // TODO Auto-generated method stub return new
 * User("foo", "foo", new ArrayList<>()); }
 * 
 * @Override public Authentication authenticate(Authentication authentication)
 * throws AuthenticationException { String name = authentication.getName();
 * String password = authentication.getCredentials().toString(); return new
 * UsernamePasswordAuthenticationToken( name, password, new ArrayList<>()); }
 * 
 * @Override public boolean supports(Class<?> authentication) { // TODO
 * Auto-generated method stub return true; }
 * 
 * }
 */