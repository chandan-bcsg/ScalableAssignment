# ScalableAssignment
Scalable Assignment
# Microservices Application with User and Order Services

## Project Overview

This project is a microservice-based architecture developed using **Java 17**, **Spring Boot**, **MongoDB**, **PostgreSQL**, **Docker**, and **Kubernetes**. It consists of two core microservices: the **User Service** (responsible for user management) and the **Order Service** (responsible for order management). These services are containerized using Docker and deployed on a Kubernetes cluster.

### Microservices Overview

1. **User Service**:
   - Manages user-related operations such as creating and retrieving users.
   - Uses **MongoDB** as the database for storing user data.

2. **Order Service**:
   - Handles order-related operations such as creating and retrieving orders.
   - Uses **PostgreSQL** as the database for storing order data.

---

## Technologies Used

- **Java 17**
- **Spring Boot** (REST API, JPA)
- **MongoDB** (for User Service)
- **PostgreSQL** (for Order Service)
- **Docker** (for containerization)
- **Kubernetes** (for orchestration)
- **Maven** (for build automation)
- **Minikube** (local Kubernetes cluster)

---

## Project Structure

ScalableAssignment/
├── user-service/
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
│   ├── application.yml
│   └── ...
├── order-service/
│   ├── src/
│   ├── pom.xml
│   ├── Dockerfile
│   ├── application.yml
│   └── ...
├── k8s/
│   ├── user-service-deployment.yaml
│   ├── order-service-deployment.yaml
│   ├── user-service-service.yaml
│   └── order-service-service.yaml
├── docker-compose.yml