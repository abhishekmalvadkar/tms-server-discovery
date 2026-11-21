FROM eclipse-temurin:21.0.13.1_2-jre
MAINTAINER "Abhishek M"
COPY target/tms-server-discovery.jar  /app/app.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "app.jar"]
