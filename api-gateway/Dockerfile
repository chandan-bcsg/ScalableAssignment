# Start with a base image containing Java 17
FROM openjdk:17-jdk-slim

# Add the API Gateway JAR file
COPY target/api-gateway-1.0.0.jar api-gateway.jar

# Expose port 8080 for the API Gateway
EXPOSE 8080

# Command to run the API Gateway application
ENTRYPOINT ["java", "-jar", "/api-gateway.jar"]