# Java-Spring-Boot-CRUD-REST-APIs-for-User-Management

Project Overview

This project is a simple CRUD (Create, Read, Update, Delete) REST API developed using Java Spring Boot. It is structured in a 3-layer architecture consisting of the Controller Layer, Service Layer, and Repository Layer, implementing a clear separation of concerns and modular design.

Technologies and Tools

Java Spring Boot
Spring Data JPA
Hibernate ORM
MySQL Database
DTO (Data Transfer Object) Pattern
Spring Boot Actuator
Spring Boot Validation
Swagger UI

Architecture and Implementation

1.Controller Layer:

Handles HTTP requests and maps them to the appropriate service methods.
Implements endpoints for all CRUD operations: creating, reading, updating, and deleting User entities.

2.Service Layer:

Contains the business logic for processing data and interacting with the repository layer.
Manages transactions and ensures data consistency.

3.Repository Layer:

Interacts with the database using Spring Data JPA to perform CRUD operations.
Utilizes Hibernate as the ORM framework for object-relational mapping.

User Entity and Data Mapping

The User entity is mapped to a corresponding database table using JPA annotations.
Hibernate is used to manage the persistence and mapping of entity data.

DTO Implementation

The DTO pattern is used to transfer data between client and server.
User data is encapsulated in a DTO object to maintain data consistency and avoid exposing internal entity structure.

Exception Handling

Custom exceptions are implemented to handle specific error scenarios effectively.
These exceptions are used to standardize API responses and provide informative error messages.

Validation

Spring Boot Validation is used to enforce data integrity and validate request payloads.

Monitoring and Actuator

Spring Boot Actuator is included to monitor application metrics and health.
Endpoints like /actuator/health provide runtime information.

API Documentation with Swagger UI

Swagger UI is integrated for API documentation and testing.
All CRUD endpoints can be accessed and tested via the Swagger UI interface.

Functionality

Create User: POST request to create a new user.
Read User: GET request to retrieve a user by ID or fetch all users.
Update User: PUT request to update user data.
Delete User: DELETE request to remove a user by ID.

Summary

The project demonstrates a clean and modular implementation of a basic CRUD REST API using Java Spring Boot. It leverages JPA and Hibernate for data persistence, custom exception handling for error management, validation for data integrity, and Spring Boot Actuator for monitoring. Additionally, Swagger UI is integrated for API documentation and testing, allowing all CRUD operations to be executed directly from the UI.
