# README

## Adding security to a REST API with Spring Security

Barebone project with spring boot web and spring security.

# Start the application

```bash
mvnw spring-boot:run
```

Access the local server at  [http://localhost:8080]().

Use the credentials defined at `application.properties` file to log in.

```bash
spring.security.user.name=john
spring.security.user.password=user123
spring.security.user.roles=USERS
```

Still, after logging in, just a Whitelabel Error Page would be shown because there's nothing created in the application yet.

![whitelabel error page](images/whitelabel-error-page.png)

----
## Next - Web Secirity Configuration

Change to the `step02` branch to setup users with web security configuration.

```bash
git checkout step02
```