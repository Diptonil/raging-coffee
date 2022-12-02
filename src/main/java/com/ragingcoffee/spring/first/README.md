# The First Spring Project

This is the first demo project built using Spring and would serve as an example as to how to build projects using this framework.


## What is Being Built?

A Course REST API is being built that primarily deals with the management of 3 types of data: topics, lessons and courses (structured similar to how Udemy courses work). The API is responsible for management of courses. Every course would have a certain number of lessons within them. Those lessons would be subdivided into topics. The model chosen is deliberately simple from the perspective of a starter. Here:
- The API responds to the classic GET, POST, PUT and DELETE requests.
- The API can handle CRUD operations using JPA. We use Apache Derby as the relational database.


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
- The `application.properties` file contains configurational information with respect to the project that basically ensures that the project can work in any type of segregated environment (test, development, etc.). This is a configurational file that is somewhat similar to the `settings.py` file in Django. Certain settings can be mentioned here. An exhaustive list of all possible settings can be found in the docs <a href="https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html">here</a>.


## The API App Folder

Over the course of development, many different components would come up. All of them are neatly segregated and kept in their separate directories to make things modular. The folders that would be present in the app folder (the folder having the `TodoApplication.java` file) are:
- `controllers`: Controllers responsible for executing code when request comes in (to whichever URL) are kept here.
- `models`: Models representing database tables are kept here.
- `services`: Services responsible for handling data when a particular controller is triggered are kept here.
- `repositories`: Repositories responsible for maintaining the logic of the data being stored, retrieved, et cetera in the database.


## Controllers

A Controller is a Java class with a suite of annotations that basically instructs:
- What to do when a certain request is being made?
- What URL access triggers what request?
Comparing to Django, it is somewhat (loosely, not a very accurate comparison) similar to urls. It doesn't strictly dictate the logic of the processing or capturing of the data. It just signifies what happens when a certain request is being made to a certain URL path.


## Processing Requests

As stated below, the `@RequestMapping()` annotation is responsible for dealing with all sorts of requests. The important parameters the annotation takes are: `value` (the URL to which request would be sent) and `method` (the HTTP method that would be dealt with). It is important to understand that handling of all requests would happen only in the controllers.


## Externally Making Requests

We do not have a frontend that allows us to click fancy buttons and fill up forms for passing data. That isn't the scope of the project. We just have a REST API running. To make requests, we can use a lot of tools (like Postman, IDE extensions). However, we would stick to the old-school and use `curl`. Just ensure to have escape sequences (`\"`) while writing the JSON in place of `{...}`.
- To make a POST request:
    ```sh
    curl -X POST localhost:8080/topics/ -H "Content type: application/json" -d "{...}"
    ```
- To make a PUT request:
    ```sh
    curl -X PUT localhost:8080/topics/ -H "Content type: application/json" -d "{...}"
    ```
- To make a DELETE request:
    ```sh
    curl -X DELETE localhost:8080/topics/ -H "Content type: application/json" -d "{...}"
    ```


## JPA

- JPA is the way to make data persist within Java apps (see the `jpa.md` file in the `spring` directory for more details). We can easily convert classes into tables just by using some simple annotations (mentioned below).
- Repositories are components in an application that are responsible for defining the methods that process (or perform CRUD operations on) the data in the models. These are interfaces that need to be defined.
- The `CrudRepository<Model,PrimaryKeyDataType>` interface provides a default suite capable of handling CRUD operations on the database without us having to code the corresponding logic.


## Some Important Spring Annotations

The Spring Framework is annotation-heavy. These annotations carry a special meaning to the compiler. When the project is started for the first time, these annotations can be seen:
1. `@SpringBootApplication`: Tells the compiler that this class is the starting point with the main method for the application.
1. `@RestController`: Tells the compiler that the marked class is a controller with some logic accessible by a defined URL.
1. `@RequestMapping()`: Tells the compiler what to execute when a given request method (GET, PUT, etc.) *and* a given URL is executed.
1. `@PathVariable()`: Tells the compiler that the annotated argument is passed from the url that gets accessed.
1. `@RequestBody`: Tells the compiler that the annotated argument is to be accepted from the request body to be operated on.
1. `@Service`: Tells the compiler that the annotated class is a service.


## Some Important JPA Annotations

1. `@Entity`: Tells the compiler that a certain class is to become a database entity. All data members are to be attributes.
1. `@Table()`: Tells the compiler that a certain class is a table with given name. This isn't mandatory. This is used only because sometimes in databases, table names differ from entity names.
1. `@Column()`: Tells the compiler that a certain data member is a column (with a given name, constraints, etc.).
1. `@Id`: Tells the compiler about the primary key of the table.
1. `@Transient`: Tells the compiler that a certain field is to be made non-persistent. These are fields like *age*, that can just be derived from the date of birth (it is redundant to use such an attribute, in fact).