
# Spring Boot Example

This is a Java-based RESTful API developed as part of the [Java Master Class course](https://amigoscode.com/p/java-master-class) by [amigoscode.com](https://amigoscode.com/). The API follows an N-Tier architecture, providing a structured backend for managing customer information. It utilizes Spring Boot, Maven, and other technologies to facilitate rapid development and efficient dependency management.


## Project Structure

The project structure follows industry best practices for organizing code and separating concerns. The main components include:

- `org.maria.customer`: Contains the Customer class representing customer information.
- `org.maria.customer.CustomerController`: A layer responsible for mapping API endpoints using @GetMapping annotations. It handles HTTP requests and delegates business logic to the CustomerService layer.
- `org.maria.customer.CustomerDao`: An interface defining the contract for accessing customer data.
- `org.maria.customer.CustomerDataAccessService`: An implementation of the CustomerDao interface. It interacts with the database and provides data access functionality. The class is annotated with @Repository.
- `org.maria.customer.CustomerService`: The business logic layer of the application. It uses dependency injection with CustomerDao to interact with customer data. The class is annotated with @Service.
- `Main.java`: The entry point of the application. It contains the @SpringBootApplication annotation, which starts the Spring Boot application and enables the automatic dependency injection feature.
- `org.maria.exception.ResourceNotFound`: A custom exception class representing a resource not found error.
## API Path

The Customers API exposes the following endpoint for accessing customer information:

- `/api/v1/customers`: This endpoint provides access to various CRUD operations for managing customer data. It follows RESTful principles and is designed to maintain backward compatibility when upgrading the API version.

 - `/api/v1/customers/{customerId}`: This endpoint allows specific customer information to be retrieved, updated, or deleted by providing the customer ID in the path parameter.
## Dependencies and Learnings

During the course, several key topics and technologies were covered, leading to the following learnings and increased familiarity:

- __Java Basics and Beyond__: Covered essential Java topics, including loops, exception handling, classes, objects, working with files, object-oriented programming (OOP), SOLID principles, data structures, generics, streams, testing, and more.
- __Maven__: Learned how to use Maven as a build and dependency management tool, simplifying project setup and managing dependencies.
- __HTTP and APIs__: Gained further understanding of HTTP concepts and how to build APIs for data manipulation and retrieval.
- __RESTful Principles__: Applied REST (Representational State Transfer) principles in designing the API, ensuring a standardized approach to web service development.
- __Postman__: Utilized Postman for API testing, allowing quick and efficient validation of API endpoints and responses.
- __Spring and Spring Boot__: Explored the Spring framework and Spring Boot, leveraging the power of dependency injection, managing application contexts, and creating RESTful APIs.
- __Inversion of Control__: Learned about the Spring Inversion of Control (IoC) principle and how it simplifies dependency management and object creation by leveraging the Spring container.
- __Bean Scopes__: Understood different bean scopes in Spring, including the default Singleton scope used in this project, managing the visibility and lifecycle of beans.
- __Structured Backend__: Followed N-Tier architecture to organize the project into layers, ensuring separation of concerns and maintainability.
- __Spring Boot Error Handling__: Implemented custom exceptions and used @ResponseStatus to set appropriate HTTP response status codes. Improved error messages to provide better clarity to clients.