
# Dockerfile
FROM openjdk:11

WORKDIR /app

COPY target/your-spring-boot-app.jar ./app.jar

EXPOSE 8083

# Start the Spring Boot application
CMD ["java", "-jar", "target/*.jar"]