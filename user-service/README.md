# User Service

## Description
The User Service is a microservice responsible for managing user-related operations, including user creation and retrieval. It uses MongoDB as its database for storing user information.

## Technologies Used
- Spring Boot
- MongoDB
- Java
- Maven

## API Endpoints

### 1. Get All Users
- **URL:** `/api/users`
- **Method:** `GET`
- **Description:** Retrieves all users from the database.
- **Response:**
  - 200 OK: List of users

### 2. Create User
- **URL:** `/api/users`
- **Method:** `POST`
- **Description:** Creates a new user in the database.
- **Request Body:**
  ```json
  {
      "name": "John Doe",
      "email": "john.doe@example.com",
      "age": 30
  }
  

## Running the User Service
1. Ensure MongoDB is running on your local machine.
2. Clone the repository and navigate to the `user-service` directory.
3. Build the service using Maven:
   ```bash
   mvn clean install
  
 4. Run the service 
    java -jar target/user-service-1.0.0.jar
    
 5. Access the User Service at http://localhost:8082/api/users.
    

 
