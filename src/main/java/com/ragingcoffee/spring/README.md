# The Spring Framework

Spring is the largest and the most supported Java framework out there for building applications. The majority of core Java development for the backend has shifted to Spring completely. There are a few more frameworks in the Java environment but none are as mature and refined as this. A *backend framework* is a tool used in conjunction to the language it is supported for that allows us to write strong backends quickly and easily, abstracting away from us all the low-level details like configuring and starting up servers, maintaining database connectivity, et cetera. <br />
It is primarily used to make web app API backends as well as fullstack apps (which has been possible with increased support).


## Pros of Spring

- **Dependency Injection**: This refers to the property of being able to include a dependency just by adding a line of code in the project management file. This also helps us in having the dependency listed somewhere. Moreover, to remove the dependency, we just need to delete the line of code. That's it. Unlike frameworks like Django, we don't have to install the dependencies and ship them off to a requirements file periodically so that we can keep a track of dependencies. Moreover, removing dependencies from the virtual environments in Django is also a hassle.
- **Supportive**: The Spring community provides support and resources to get you to the next level QuickStart guides, tutorials, videos, and meetup helps a lot.
- **Microservices**: Spring is a decent framework when it comes to microservices written in other languages. It is a better choice than frameworks like Django that is extremely tightly-coupled that pushes code towards a more monolithic style.
- **Fast**: The team of Spring engineers deeply cares about the performance. Its fast startup, fast shutdown, and optimized execution maintain performance make it fast. Even, we can start a new Spring project in seconds by using Spring Initializr.


## Cons of Spring

- **Complexity**: Working with Spring is extremely complex as it requires a lot of expertise. The learning curve is difficult. It is not a good choice for someone who is new to development. Not even if that person knows core Java.
- **Old-Fashioned**: Not all old-fashioned things go out of commission but this framework has been criticized time and again for it's absurd levels of complexity and features that are not modern. It's heavy use of XML, reliance of different components such as Spring Security, Spring Web Starter, et cetera instead of having a standalone wholesome facility in one place, application code structuring makes it a bit too classic to be embraced with ease.
- **Security**: Less built-in security features, unlike frameworks like Django.


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

1. **Spring Web**: Uses Apache Tomcat as the default web server. This is used to spin up servers for RESTful purposes.


## Difference Between Real Projects and These Example Projects

When using Spring Boot, we get a ZIP file. Upon extraction, we notice these files:
- A `.mvn` folder.
- A `src` directory with source and tests.
- A `HELP.md` file.
- A `.gitignore` file.
- A `README.md` file.
- A `pom.xml` file.
- A `mvnw` and `mvnw.cmd`. <br />
We shall delete the `.gitignore` file and `HELP.md` files here. This is **not** something that shall be done while the development of real-world apps. Most probably, the zipped folder contents would be the only folder that gets committed to a repository (be it monorepo or a polyrepo). So the `.gitignore` file should remain, at least.


## Roadmap to Build Apps

Theere is no agreed-upon predefined framework to define the way we proceed to build the application. However, a common way to approach any project is to follow this pathway one step at a time:
- First, build the Data Access Layer (the database).
- Second, build the Service Layer (the business logic).
- Third, build the API Layer that takes in requests and throws out responses.