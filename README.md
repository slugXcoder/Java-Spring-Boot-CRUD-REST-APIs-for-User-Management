# Java-Spring-Boot-CRUD-REST-APIs-for-User-Management

Java Spring Boot CRUD REST API

A simple CRUD (Create, Read, Update, Delete) REST API developed using Java Spring Boot, structured using a 3-layer architecture consisting of the Controller Layer, Service Layer, and Repository Layer. This project demonstrates the implementation of CRUD operations with data persistence using JPA and Hibernate, custom exception handling, data validation, monitoring with Spring Boot Actuator, and API documentation using Swagger UI.

🛠️ Technologies and Tools

Java Spring Boot

Spring Data JPA

Hibernate ORM

MySQL Database

DTO (Data Transfer Object) Pattern

Spring Boot Actuator

Spring Boot Validation

Swagger UI

✅ Architecture and Implementation

1. Controller Layer

Handles HTTP requests and maps them to the appropriate service methods.

Implements endpoints for CRUD operations: creating, reading, updating, and deleting User entities.

2. Service Layer

Contains the business logic for data processing and interaction with the repository layer.

Manages transactions and ensures data consistency.

3. Repository Layer

Interacts with the database using Spring Data JPA.

Implements Hibernate for object-relational mapping and data persistence.

📦 User Entity and Data Mapping

The User entity is mapped to a corresponding database table using JPA annotations.

Hibernate is utilized to manage the persistence and mapping of entity data.

📦 DTO Implementation

Implements the DTO pattern to transfer data between client and server, maintaining data consistency and security.

🚨 Exception Handling

Custom exceptions are implemented to handle specific error scenarios effectively.

Standardized API responses and informative error messages are provided for better client-side handling.

✅ Validation

Data validation is implemented using Spring Boot Validation to enforce data integrity and validate request payloads.

📈 Monitoring and Actuator

Spring Boot Actuator is integrated to monitor application metrics and health.

Access runtime information via /actuator/health and other endpoints.

📜 API Documentation with Swagger UI

Swagger UI is configured to provide interactive API documentation and testing.

All CRUD endpoints can be accessed and tested directly from the Swagger UI interface.

📦 CRUD Functionality

Create User: POST /users - Create a new user.

Read User: GET /users/{id} - Retrieve a user by ID or GET /users - Fetch all users.

Update User: PUT /users/{id} - Update user data.

Delete User: DELETE /users/{id} - Remove a user by ID.

📌 Summary

This project demonstrates a well-structured and modular implementation of a basic CRUD REST API using Java Spring Boot. It includes JPA and Hibernate for data persistence, custom exception handling, data validation, Spring Boot Actuator for monitoring, and Swagger UI for API documentation and testing, allowing direct execution of CRUD operations from the UI.
