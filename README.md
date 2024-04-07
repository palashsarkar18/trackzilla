# Trackzilla - A Spring Boot Reference Project

## Description
Trackzilla is a reference project demonstrating fundamental concepts of Spring Boot, including dependency injection, database operations with JPA, and building a GraphQL API. It serves as an educational tool for beginners looking to understand how to build web applications with Spring Boot. The project showcases CRUD operations on applications, tickets, and releases, all accessible through a GraphQL API.

## Features
- Manage applications, tickets, and releases using a GraphQL API
- Demonstrate CRUD operations with JPA
- Custom exception handling
- In-memory H2 database integration for easy setup and testing

## Installation
1. Clone the repository to your local machine.
2. Ensure you have Java 17 and Maven installed.
3. Navigate to the project directory and run `mvn spring-boot:run` to start the application.
4. Access the GraphQL playground at `http://localhost:8000/tzarest` to explore the API.

## Usage
The GraphQL API provides endpoints for managing applications, tickets, and releases. Explore the provided schema and test queries in the GraphQL playground to understand the available operations.