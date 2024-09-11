# Use a base image with Maven and JDK for the build stage
FROM maven:3.8.6-openjdk-17 AS build

# Set working directory
WORKDIR /app

# Copy the Maven project files
COPY pom.xml .
COPY src ./src

# Package the application
RUN mvn clean package -DskipTests

# Use a base image with Java runtime for the final stage
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the jar file from the build stage
COPY --from=build /app/target/Login-Page-Automation-Dockerized-0.0.1-SNAPSHOT.jar /app/app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]