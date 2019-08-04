# spring-boot-web-server

Made as a sample for a friend, specific to a side project. Not production ready.

## Explination

A basic sping boot web application based around the creation, modification, and deletion of the User class. Exposes api through built in request mapping. Processes requests using the standard controller/service paradigm. Stores data in relations database using JPA to map the user class to a database schema.

## To run

```bash
mvn compile
mvn exec:java -Dexec.mainClass=adam.http.springboot.App
```
## Postman Collection

https://www.getpostman.com/collections/ec743606013cfcb712cf
