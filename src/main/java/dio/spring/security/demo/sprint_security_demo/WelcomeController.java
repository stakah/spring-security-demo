package dio.spring.security.demo.sprint_security_demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class WelcomeController {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to Spring Boot Web API with Spring Security";
    }

    @GetMapping("/users")
    @PreAuthorize("hasAnyRole('MANAGERS','USERS')")
    public String getUsers() {
        return "Authorized users";
    }
    
    @GetMapping("/managers")
    @PreAuthorize("hasRole('MANAGERS')")
    public String getManagers() {
        return "Only MANAGERS can see this page";
    }
    
}
