FROM openjdk:jdk-alpine

MAINTAINER Wolfdale <random@gmail.com>

COPY target/service-0.0.1-SNAPSHOT.jar /opt/

CMD java -jar /opt/service-0.0.1-SNAPSHOT.jar
