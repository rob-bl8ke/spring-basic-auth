package guru.springframework.spring6restmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecConfig {
    // Add a spring security filter chain
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(httpSecurityCsrfConfigurer -> {
           httpSecurityCsrfConfigurer.ignoringRequestMatchers("/api/**");
        });
        return http.build();
    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//        http.authorizeHttpRequests()
//                .anyRequest().authenticated()
//                .and().httpBasic(Customizer.withDefaults())
//                .csrf().ignoringRequestMatchers("/api/**");
//
//        return http.build();
//
//    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests(authorizeRequests -> authorizeRequests.anyRequest().authenticated())
//                .httpBasic(withDefaults());
//        return http.build();
//    }
}
