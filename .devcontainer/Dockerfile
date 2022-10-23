FROM maven:3-jdk-8

LABEL version=0.9.0
LABEL status="unreleased"
LABEL maintainer.primary="Diptonil Roy"
LABEL contributor.one="jivjen"

WORKDIR /usr/src/app

COPY ../ /usr/src/app

RUN mvn clean package -Dmaven.test.skip=true

ENTRYPOINT ["java", "-jar", "/usr/src/app/target/ragingcoffee-1.0-SNAPSHOT.jar"]

EXPOSE 8080
