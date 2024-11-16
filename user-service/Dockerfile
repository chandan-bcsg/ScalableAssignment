# Start with a slim base image for Java 17
FROM openjdk:17-jdk-slim

# Set environment variables (optional for flexibility)
ENV APP_NAME=user-service
ENV APP_VERSION=1.0.0
ENV PORT=8082

# Copy the JAR file into the container
# Make sure the filename matches the JAR name in the target directory
COPY target/${APP_NAME}-${APP_VERSION}.jar ${APP_NAME}.jar

# Expose the service port
EXPOSE ${PORT}

# Run the application
ENTRYPOINT ["java", "-jar", "/user-service.jar"]
