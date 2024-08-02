package dio.spring.security.demo.sprint_security_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfiguration  {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.builder()
        .username("john")
        .password("{noop}user321")
        .roles("USERS")
        .build();

        UserDetails manager = User.builder()
        .username("manager")
        .password("{noop}manager321")
        .roles("MANAGERS")
        .build();

        return new InMemoryUserDetailsManager(user, manager);
    }
}