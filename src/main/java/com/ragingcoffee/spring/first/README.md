# The First Spring Project

This is the first demo project built using Spring and would serve as an example as to how to build projects using this framework.


## Starting Up a Project

Ensure that you are at the directory that has the files: `pom.xml`, `mvnw`, `mvnw.cmd`, et cetera (if we are using Maven, otherwise it would be Gradle files). 
- The server starts up by default at 8080 port (can be changed if we wish to).
- The server is Apache Tomcat.
- The command given below runs only because we have a plugin (Spring Boot Maven) in our `pom.xml`.
- When the server succesfully starts up, we get to see a message resembling "Started ... in x seconds". <br />
To start up a project using Maven, we use:
```sh
mvn spring-boot:run
```


## The `resources` Folder

It has the three things:
- The `static` folder has all static files and resources, including CSS files to lend styles to the web pages.
- The `templates` folder has HTML files.
- The `application.properties` file contains configurational information with respect to the project that basically ensures that the project can work in any type of segregated environment (test, development, etc.).


## The Four Packages

We create 4 packages right at the beginning before beginning development. This is in the same directory where we have `FirstApplication.java` located. The packages are:
- `api`:
- `dao`:
- `model`: This is used for database model definitions. We shall store the database tables here. A single class for a single table is the nor if we are going for a relational data model.
- `service`: