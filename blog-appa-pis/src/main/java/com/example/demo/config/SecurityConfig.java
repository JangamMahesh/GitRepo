/*
 * package com.example.demo.config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.AuthenticationManager; import
 * org.springframework.security.authentication.dao.DaoAuthenticationProvider;
 * import
 * org.springframework.security.config.annotation.authentication.configuration.
 * AuthenticationConfiguration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.web.DefaultSecurityFilterChain; import
 * org.springframework.security.web.SecurityFilterChain;
 * 
 * import com.example.demo.services.impl.MyUserDetailsService;
 * 
 * @EnableWebSecurity
 * 
 * @Configuration public class SecurityConfig {
 * 
 * @Autowired private MyUserDetailsService myUserDetailsService;
 * 
 * @SuppressWarnings("deprecation")
 * 
 * @Bean public SecurityFilterChain securityFilterChain(HttpSecurity http)
 * throws Exception {
 * http.csrf().disable().authorizeHttpRequests().requestMatchers("/api/users/**"
 * ).permitAll().anyRequest() .authenticated();
 * http.authenticationProvider(myUserDetailsService); DefaultSecurityFilterChain
 * defaultSecurityFilterChain = http.build(); return defaultSecurityFilterChain;
 * 
 * http .authorizeHttpRequests((authz) -> authz .anyRequest().authenticated() )
 * .httpBasic(); return http.build();
 * 
 * 
 * }
 * 
 * @Bean public AuthenticationManager
 * authenticationManagerBean(AuthenticationConfiguration configuration) throws
 * Exception { return configuration.getAuthenticationManager(); }
 * 
 * @Bean public DaoAuthenticationProvider daoAuthenticationProvider() {
 * DaoAuthenticationProvider authenticationProvider = new
 * DaoAuthenticationProvider();
 * authenticationProvider.setUserDetailsService(myUserDetailsService);
 * authenticationProvider.setPasswordEncoder(getPasswordEncoder()); return
 * authenticationProvider;
 * 
 * }
 * 
 * 
 * @Bean public InMemoryUserDetailsManager userDetailsService() { UserDetails
 * user = User.WithUsername("user").password("password").roles("USER").build();
 * return new InMemoryUserDetailsManager(user); }
 * 
 * 
 * @Bean public PasswordEncoder getPasswordEncoder() { return new
 * BCryptPasswordEncoder(); }
 * 
 * @Bean public static NoOpPasswordEncoder passwordEncoder() { return
 * NoOpPasswordEncoder.getInstance(); }
 * 
 * }
 */