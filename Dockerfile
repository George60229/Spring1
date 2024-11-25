FROM openjdk:17-jdk-alpine
COPY build/libs/spring_docker.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]