# CourseApiData

## Description

This application is a library management system which allows you to see, edit and delete all book entries. You can add new books as well. Besides, you will receive a Welcome Email after submiting your email on Contact section.

## Personal goals

- Get familiar with Spring Boot framework and learn how to perform basic CRUD operations
- Implement a simple microservice such as a mail sender by using the Spring Boot Rest API

## Core technologies

*Back-end*
- Spring Boot
- Hibernate (as a JPA framework)

*Dependency management tool*
- Maven

*IDE*
- Spring Tool Suite

## Build setup

- Clone this repo to your local machine. If you use Spring Tool Suite as IDE, open this project there:

```
# Import the project to STS

File -> Import -> Git -> Projects from Git -> Existing local repository -> Add ${Directory where you have cloned the repo} -> Import existing Eclipse projects
```

- Run the project as Spring Boot App

- Postman or any other API tester must be already installed in your machine. Otherwise, you will have to install them. You can perform the requests below in order to test the application:

|   | HTTP Request | Endpoint | Body |
| ------------- | ------------- | ------------- | ------------- |
| Create a new topic  | POST  | /topics/  | {"id": "java", "name": "Java 8", "description": "Java 8 description"} |
| Read all the topics  | GET  | /topics/ | |

## References

I have accomplished the aforementioned goals thanks to the following courses:

- [Spring Boot Quick Start](https://www.youtube.com/watch?v=msXL2oDexqw&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x)
