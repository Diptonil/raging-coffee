# The Spring Framework

Spring is the largest and the most supported Java framework out there for building applications. The majority of core Java development for the backend has shifted to Spring completely. There are a few more frameworks in the Java environment but none are as mature and refined as this. A *backend framework* is a tool used in conjunction to the language it is supported for that allows us to write strong backends quickly and easily, abstracting away from us all the low-level details like configuring and starting up servers, maintaining database connectivity, et cetera. <br />
It is primarily used to make web app API backends as well as fullstack apps (which has been possible with increased support).


## Pros of Spring

- **Dependency Injection**: This refers to the property of being able to include a dependency just by adding a line of code in the project management file. This also helps us in having the dependency listed somewhere. Moreover, to remove the dependency, we just need to delete the line of code. That's it. Unlike frameworks like Django, we don't have to install the dependencies and ship them off to a requirements file periodically so that we can keep a track of dependencies. Moreover, removing dependencies from the virtual environments in Django is also a hassle.


## Cons of Spring


## Spring Boot

Spring Boot is a tool built atop Spring to support rapid Spring development. It supports Java, Kotlin and Groovy as of now. The features that it has:
- It is not a framework or successor of Spring (or anything like that). It is just a tool to tackle boilerplate and dependency problems.
- Embed Tomcat, Jetty or Undertow directly without configuring their JARs or any other things.
- We can choose if we want to package our project with Gradle or Maven.
- We can easily define project metadata.
- Absolutely no code generation and no requirement for XML configuration.
- Provide production-ready features such as metrics, health checks, and externalized configuration.
- Most importantly, we can easily select all major project dependencies and services that we would use for the project. More can be added later. The configurational file would come packed with these dependencies that can be manipulated as well later, if need be.


## Popular Spring Boot Dependencies

1. **Spring Web Starter**: Uses Apache Tomcat as the default web server. This is used to spin up servers for RESTful purposes.

## Difference Between Real Projects and These Example Projects

When using Spring Boot, we get a ZIP file. Upon extraction, we notice these files:
- A `.mvn` folder.
- A `src` directory with source and tests.
- A `target` directory having the class files.
- A `README.md` file.
- A `pom.xml` file.
- A `mvnw` and `mvnw.cmd`. <br />
However, the example projects contained in this repository has all the files except `target`, `pom.xml` and `.mvn` folder. This is because the target gets generated upon compilation anyway and there is a `.mvn` folder in the main directory (Git-ignored). <br />
The reason of the POM file not being there is because the dependencies are already managed by the main POM file. *This is a bad practice for main projects and should not be implemented*. Anyway, when a web backend project is running standalone (or even as a microservice), there would exist only one primary project with one POM file. There exist multi-modular web project structures as well but that shall not be dealt here (if that happens, the programmer is better off with using Eclipse or IntelliJ as an IDE for better support). <br />
Due to this reason, the examples given here should be treated as a resource *to learn how to code* rather than learning how to configure from scratch. Spring Boot offers succinct functionality that, in this case, should be leveraged thoroughly.