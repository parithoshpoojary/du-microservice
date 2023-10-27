FROM amazoncorretto:11-alpine3.18
MAINTAINER Parithosh Poojary <parithosh21129917@gmail.com>
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cloud-gateway.jar
ENTRYPOINT ["java","-jar","/cloud-gateway.jar"]
EXPOSE 9191