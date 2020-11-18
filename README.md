## Spring Security OAuth with SSO - Working PoC

### Relevant information:

1. `sso-authorization-server` is a Keycloak Authorization Server wrapped as a Spring Boot application. The embedded Keycloak will run at http://localhost:8083/auth
2. There are two users registered in the Authorization Server:
   1. john@test.com / 123
   2. mike@other.com / pass
3. There are two OIDC-Connect Clients registered in the Authorization Server:
First -
   1. Client Id: ssoClient-1
   2. Client secret: ssoClientSecret-1
   3. Redirect Uri: http://localhost:8082/ui-one/login/oauth2/code/custom
And second -
   1. Client Id: ssoClient-2
   2. Client secret: ssoClientSecret-2
   3. Redirect Uri: http://localhost:8084/ui-two/login/oauth2/code/custom
4. `sso-resource-server` is a Spring Boot based RESTFul API, acting as a backend Application. This backend service will run at http://localhost:8081  
5. `sso-client-app-1` and `sso-client-app-2` are two identical Spring MVC Thymeleaf App acting our front end. They will be available at [http://localhost:8082/ui-one/](http://localhost:8082/ui-one) and [http://localhost:8084/ui-two/](http://localhost:8084/ui-two/) respectively. 

### Steps to test SSO:
1. Start all 4 boot applications - Authorization Server, Resource Server and both Client Applications
2. Open a browser
3. Login to Client Application 1 ( http://localhost:8082/ui-one/ ) using the credentials john@test.com / 123. After successful login, frontend application will open Foos app.
4. On another new tab of same browser, open Client Application 2 ( http://localhost:8084/ui-two/ ). It will ask you for login. Once you click login, it will directly take you to the Foos app page without asking you again for credentials. This prooves the SSO login.

## Reference Articles: 
- [Simple Single Sign-On with Spring Security OAuth2](https://www.baeldung.com/sso-spring-security-oauth2)
