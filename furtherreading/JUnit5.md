# JUnit5

- The JUnit is one of the most popular testing frameworks in Java. The current version, JUnit5 supports many new versions of Java and supports multiple types and flavours of testing.
- Since we are using Apache Maven, we just need to add the corresponding dependency to the `pom.xml` file from the official website.


## Architecture of the Framework

There are three components of the framework that has all its different modules coming from:
- **JUnit Platform**: The platform is responsible for launching testing frameworks on the JVM. It defines a stable and powerful interface between JUnit and its clients, such as build tools. The platform easily integrates clients with JUnit to discover and execute tests.
- **JUnit Jupiter**: This module includes new programming and extension models for writing tests in JUnit 5. A lot of new annotations are introduced that shall be seen ahead.
- **JUnit Vintage**: This supports running tests based on JUnit 3 and JUnit 4 on the JUnit 5 platform.


## Basic Annotations

Note that in the succeeding discussion, it is important to maintain the method signature that have been taken in case of every annotation. And it is best to use the framework in this format. Also, every test method is annotated with `@Test`.
- `@BeforeAll`:
    ```java
    @BeforeAll
    static void setup() {
        log.info("@BeforeAll - executes once before all test methods in this class");
    }
    ```
- `@BeforeEach`:
    ```java
    @BeforeEach
    void init() {
        log.info("@BeforeEach - executes before each test method in this class");
    }
    ```
- `@DisplayName`:
    ```java
    @DisplayName("Single test successful")
    @Test
    void testSingleSuccessTest() {
        log.info("Success");
    }
    ```
- `@Disabled`:
    ```java
    @Test
    @Disabled("Not implemented yet")
    void testShowSomething() {
    }
    ```
- `@AfterEach`:
    ```java
    @AfterEach
    void tearDown() {
        log.info("@AfterEach - executed after each test method.");
    }
    ```
- `@AfterAll`:
    ```java
    @AfterAll
    static void done() {
        log.info("@AfterAll - executed after all test methods.");
    }
    ```
- `@`