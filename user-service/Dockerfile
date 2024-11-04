# Start with a base image
FROM openjdk:17-jdk-slim

# Add JAR file
COPY target/user-service-1.0.0.jar user-service.jar

# Expose port
EXPOSE 8082

# Run application
ENTRYPOINT ["java", "-jar", "/user-service.jar"]
