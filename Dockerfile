FROM eclipse-temurin:17

LABEL maintainer="yuzarsifkilic@gmail.com"

WORKDIR /app

COPY target/restful_service_basic-0.0.1-SNAPSHOT.jar /app/restful_service_basic.jar

ENTRYPOINT ["java", "-jar", "restful_service_basic.jar"]