/*
package se.codeanytime.issueTracker.securityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;

@Configuration
public class BasicSecurity {
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager (){

        UserDetails ahmmuh = User.builder()
                .username("ahmmuh")
                .password("{noop}test1234")
                .roles("EMPLOYEE")
                .build();

        UserDetails peter = User.builder()
                .username("peter")
                .password("{noop}test1234")
                .roles("MANAGER")
                .build();

        UserDetails oskar = User.builder()
                .username("oskar")
                .password("{noop}test1234")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(ahmmuh,peter,oskar);
    }

    @Bean
   public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.csrf().disable().authorizeHttpRequests((authorize) -> {
            authorize.anyRequest().authenticated();
        }).formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults());
        return http.build();
    }
}
*/
