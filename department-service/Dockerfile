FROM amazoncorretto:11-alpine3.18
MAINTAINER Parithosh Poojary <parithosh21129917@gmail.com>
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} department-service.jar
ENTRYPOINT ["java","-jar","/department-service.jar"]
EXPOSE 9001