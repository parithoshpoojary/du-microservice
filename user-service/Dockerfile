FROM amazoncorretto:11-alpine3.18
MAINTAINER Parithosh Poojary <parithosh21129917@gmail.com>
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} user-service.jar
ENTRYPOINT ["java","-jar","/user-service.jar"]
EXPOSE 9002