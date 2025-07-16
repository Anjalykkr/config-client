FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/config-client-0.0.1-SNAPSHOT.jar config-client.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "config-client.jar"]