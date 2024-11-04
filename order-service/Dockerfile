# Start with a base image
FROM openjdk:17-jdk-slim

# Add JAR file
COPY target/order-service-1.0.0.jar order-service.jar

# Expose port
EXPOSE 8081

# Run application
ENTRYPOINT ["java", "-jar", "/order-service.jar"]
