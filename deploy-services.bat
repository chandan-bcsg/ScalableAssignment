@echo off
echo ============================================
echo Starting Microservices Deployment on Docker
echo ============================================

REM Step 1: Pull required Docker images for databases
echo Pulling PostgreSQL image for Order Service...
docker pull postgres:latest
echo Pulling MongoDB image for User Service...
docker pull mongo:latest

REM Step 2: Start PostgreSQL for Order Service
echo Starting PostgreSQL container for Order Service...
docker run --name order-db -e POSTGRES_USER=chandan_bits -e POSTGRES_PASSWORD=password -e POSTGRES_DB=orderdb -p 5432:5432 -d postgres:latest

REM Step 3: Start MongoDB for User Service
echo Starting MongoDB container for User Service...
docker run --name user-db -p 27017:27017 -d mongo:latest

REM Step 4: Build and deploy Order Service
echo Building and deploying Order Service...
cd order-service
mvn clean install
docker build -t order-service .
docker run --name order-service -p 8081:8081 --link order-db -d order-service
cd ..

REM Step 5: Build and deploy User Service
echo Building and deploying User Service...
cd user-service
mvn clean install
docker build -t user-service .
docker run --name user-service -p 8082:8082 --link user-db -d user-service
cd ..

REM Step 6: Build and deploy API Gateway
echo Building and deploying API Gateway...
cd api-gateway
mvn clean install
docker build -t api-gateway .
docker run --name api-gateway -p 8080:8080 --link user-service --link order-service -d api-gateway
cd ..

REM Step 7: Verify running containers
echo ============================================
echo Verifying Running Containers
echo ============================================
docker ps

echo ============================================
echo Services Deployed and Running Successfully!
echo ============================================
echo - API Gateway: http://localhost:8080
echo - User Service: http://localhost:8082
echo - Order Service: http://localhost:8081
echo - PostgreSQL (Order DB): localhost:5432
echo - MongoDB (User DB): localhost:27017
