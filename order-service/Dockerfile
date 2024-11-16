# Start with a slim base image for Java 17
FROM openjdk:17-jdk-slim

# Set environment variables (optional but can be helpful for flexibility)
ENV APP_NAME=order-service
ENV APP_VERSION=1.0.0
ENV PORT=8081

# Copy the JAR file into the container
# Ensure the filename matches the built JAR name in the target directory
COPY target/${APP_NAME}-${APP_VERSION}.jar ${APP_NAME}.jar

# Expose the port the service will run on
EXPOSE ${PORT}

# Run the application
ENTRYPOINT ["java", "-jar", "/order-service.jar"]
