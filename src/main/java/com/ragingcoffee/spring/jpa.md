# Java Persistence API

Java Persistence API is a collection of classes and methods to persistently store the vast amounts of data into a database. At the core, it is nothing but the definitipn of a concept that defines how data shall persist within a Java application (not just Spring).


## Configuration & Dependencies

- The only dependency that shall suffice (with respect to Maven):
    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
        <version>3.0.0</version>
    </dependency>
    ```
- It is important to understand that JPA, like JVM, is a concept. Spring Boot configures Hibernate as the default JPA provider. There are many others as well but Hibernate is always preferred.
- Spring Boot can also auto-configure the `dataSource` bean, depending on the database we're using. In the case of an in-memory database of type H2, HSQLDB and Apache Derby, Boot automatically configures the `DataSource`. We just need to have the dependency added. These databases are made just to support development without the added hassle of configurations and connectors, etc.
- If we want to use production-grade databases, we can use connectors. That would need a whole new class with that particular configuration.
- 