FROM amazoncorretto:11-alpine3.18
MAINTAINER Parithosh Poojary <parithosh21129917@gmail.com>
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} service-registry.jar
ENTRYPOINT ["java","-jar","/service-registry.jar"]
EXPOSE 8761