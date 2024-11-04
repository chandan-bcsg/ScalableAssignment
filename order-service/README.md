# Order Service

## Description
The Order Service is a microservice responsible for managing order-related operations, including order creation and retrieval. It uses PostgreSQL as its database for storing order information.

## Technologies Used
- Spring Boot
- PostgreSQL
- Java
- Maven

## API Endpoints

### 1. Get All Orders
- **URL:** `/api/orders`
- **Method:** `GET`
- **Description:** Retrieves all orders from the database.
- **Response:**
  - **200 OK:** List of orders

### 2. Create Order
- **URL:** `/api/orders`
- **Method:** `POST`
- **Description:** Creates a new order in the database.
- **Request Body:**
  ```json
  {
      "userId": 1,
      "product": "Product Name",
      "quantity": 2
  }

  ## Running the Order Service
1. Ensure MongoDB is running on your local machine.
2. Clone the repository and navigate to the `user-service` directory.
3. Build the service using Maven:
   ```bash
   mvn clean install
  
 4. Run the service 
    java -jar target/order-service-1.0.0.jar

    
 5. Access the User Service at http://localhost:8081/api/orders.
    