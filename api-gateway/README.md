# API Gateway

## Overview
The **API Gateway** is a critical component of the microservices-based e-commerce application. It serves as a single entry point for client requests, routing traffic to the appropriate microservices such as the **User Service** and **Order Service**. Built using **Spring Cloud Gateway**, it provides centralized request management, load balancing, and scalability.

---

## Features
- Centralized routing of API requests.
- Load balancing between multiple instances of microservices.
- Flexible routing rules based on URI patterns.
- Scalable and reactive request handling.

---

## Prerequisites
1. **Java 17**: Ensure you have Java 17 installed.
2. **Maven**: Maven is required to build the project.
3. **Docker**: For containerization.
4. **Kubernetes (Optional)**: For deployment in a Kubernetes cluster.

---

## Project Structure
```plaintext
api-gateway/
├── src/
│   ├── main/
│   │   ├── java/com/bits/assignment/apigateway/
│   │   │   ├── ApiGatewayApplication.java  # Main application class
│   │   │   └── config/
│   │   │       └── GatewayConfig.java      # Gateway routing configurations
│   ├── resources/
│   │   ├── application.yml                 # Configuration file
├── Dockerfile                              # Dockerfile for containerization
├── pom.xml                                 # Maven project file
