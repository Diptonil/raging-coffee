# The First Spring Project

This is the first demo project built using Spring and would serve as an example as to how to build projects using this framework.


## Starting Up a Project

Ensure that you are at the directory that has the files: `pom.xml`, `mvnw`, `mvnw.cmd`, et cetera (if we are using Maven, otherwise it would be Gradle files). 
- The Apache Tomcat server starts up by default at 8080 port (can be changed if we wish to). The command given below runs only because we have a plugin (Spring Boot Maven) in our `pom.xml`.
- When the server succesfully starts up, we get to see a message resembling "Started ... in x seconds". To start up a project using Maven, we use:
    ```sh
    mvn spring-boot:run
    ```
- Spring performs, at that point itself, a full class-path scan. Doing so results in it checking the whole project for annotations on classes. That is how it differentiates among every types of classes - annotations.


## The `resources` Folder

It has the three things:
- The `static` folder has all static files and resources, including CSS files to lend styles to the web pages.
- The `templates` folder has HTML files.
- The `application.properties` file contains configurational information with respect to the project that basically ensures that the project can work in any type of segregated environment (test, development, etc.).


## Controllers

A Controller is a Java class with a suite of annotations that basically instructs:
- What to do when a certain request is being made?
- What URL access triggers what request?


## Initial Annotations

The Spring Framework is annotation-heavy. These annotations carry a special meaning to the compiler. When the project is started for the first time, these annotations can be seen:
1. `@SpringBootApplication`: Tells the compiler that this class is the starting point with the main method for the application.
1. `@RestController`: Tells the compiler that the marked class is a controller with some logic accessible by a defined URL.
1. `@RequestMapping()`: Tells the compiler that upon recieving a request earmarked for an URL whose path is specified in the arguments, the contents of the marked method must be executed (the method may be named anything sensible).
1. 


## The Four Packages

We create 4 packages right at the beginning before beginning development. This is in the same directory where we have `FirstApplication.java` located. The packages are:
- `api`:
- `dao`:
- `model`: This is used for database model definitions. We shall store the database tables here. A single class for a single table is the norm if we are going for a relational data model.
- `service`:
- `controller`: