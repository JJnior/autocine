FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/cine-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app_cine.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "app_cine.jar"]