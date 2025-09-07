# Use an official Maven image as the base image
#FROM maven:3.8.4-openjdk-11-slim AS build
# Set the working directory in the container
#WORKDIR /app
# Copy the pom.xml and the project files to the container
#COPY pom.xml .
#COPY src ./src
# Build the application using Maven
#RUN mvn clean package -DskipTests
# Use an official OpenJDK image as the base image
#FROM openjdk:11-jre-slim
# Set the working directory in the container
#WORKDIR /app
# Copy the built JAR file from the previous stage to the container
#COPY - from=build/app/target/my-application.war .
# Set the command to run the application
#CMD ["java", "-jar", "my-application.war"]
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot JAR file into the container
# Replace 'your-application.jar' with the actual name of your generated JAR
COPY target/your-application.war /app/your-application.war

# Expose the port your Spring Boot application listens on (default is 8080)
EXPOSE 8082

# Define the command to run the application when the container starts
ENTRYPOINT ["java", "-jar", "your-application.war"]
