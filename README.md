# README

## Adding security to a REST API with Spring Security

Barebone project with spring boot web and spring security.

# Start the application

```bash
mvnw spring-boot:run
```

Access the local server at  [http://localhost:8080]().

Look for the generated password at the console and log in with 'user'.

```bash
2024-08-02T08:58:08.674-03:00  WARN 47224 --- [sprint-security-demo] [           main] .s.s.UserDetailsServiceAutoConfiguration :

Using generated security password: 5138a365-f3d3-4737-9f54-02f35a5d98b7

This generated password is for development use only. Your security configuration must be updated before running your application in production.
```

After logging in, just a Whitelabel Error Page would be shown because there's nothing created in the application yet.

![whitelabel error page](images/whitelabel-error-page.png)

----
## Next - Simple Authentication

Change to the `step01` branch to add Simple Authentication to the application.

```bash
git checkout step01
```