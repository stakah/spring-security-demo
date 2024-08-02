# README

## Adding security to a REST API with Spring Security

Barebone project with spring boot web and spring security.

# Start the application

```bash
mvnw spring-boot:run
```

Access the local server at  [http://localhost:8080]() to see the Welcome page. No authenticated user is required to view this page.

Accessing the [http://localhost:8080/users]() page or the [http://localhost:8080/managers]() page will prompt the user to log in. 

Using the user `john` one can access the `users` page. Using the user `manager`, both pages can be viewed.


----
## Next - JDBC authentication

Change to the `step04` branch to setup JDBC authorization.

```bash
git checkout step04
```