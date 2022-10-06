FROM maven:3-jdk-8
MAINTAINER Diptonil Roy <diptonil.roy.work@gmail.com>

WORKDIR /usr/src/app

COPY ../ /usr/src/app

RUN mvn clean package -Dmaven.test.skip=true

ENTRYPOINT ["java", "-jar", "/usr/src/app/target/ragingcoffee-1.0-SNAPSHOT.jar"]

EXPOSE 8080
