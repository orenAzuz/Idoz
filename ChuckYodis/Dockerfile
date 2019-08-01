# build as chack-yodis-back
FROM openjdk:8-alpine
RUN apk update && apk add bash

RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app
WORKDIR $PROJECT_HOME
COPY ./target/ChuckYodis-0.0.1-SNAPSHOT.jar $PROJECT_HOME/ChuckYodis-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java", "-Dspring.data.mongodb.host=mongo","-Djava.security.egd=file:/dev/./urandom", "-jar", "ChuckYodis-0.0.1-SNAPSHOT.jar" ]
