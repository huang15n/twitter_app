package cst.assignment.twitter.config;
import cst.assignment.twitter.services.UserManagementService;
import cst.assignment.twitter.services.impl.UserManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;

@Configuration

public class SecurityConfig {


    @Autowired
    private UserManagementService userManagementService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

               http
                .authorizeHttpRequests(requests -> requests
                        .requestMatchers("/messages/**","subscriptions/**", "users/**", "roles/**").permitAll()
                );

        return http.build();
    }
}
