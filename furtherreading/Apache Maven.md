# Apache Maven

Apache Maven is "a software development, management and comprehension tool". It is based on the Project Object Model (POM) that manages project build, documentation and reporting from a central piece of information.
It is, in simple terms, a build system. Every build system has some of these tasks:
- Compile source
- Run tests
- Package project
- Deploy project
- Cleanup
Maven was developed with the intention of making Java development simpler, standardized and more manageable. It provided a standard way to structure a project and made it easy for the JAR files to be published across several projects. The configurational details and project information is stored in `pom.xml`. This is used by Maven to build the project.
**NOTE**: Further sections go under the assumption that Maven has been installed in the system already. Refer to <a href="https://maven.apache.org/install.html">this</a> source for guidance.


## Maven Archetype Plugins

- Maven follows, for every Maven project, a standard project structure. We may choose which standard structure to adopt for our project. As a developer, it is tedious to set up the structure by ourselves. So we let Maven do the work.
Go to the folder where a new project is to be created. Now in the shell:
    ```sh
    mvn achetype:generate
    ```
- Archetypes are thus templates for us to choose a project structure.
- It installs some archetype plugins over the internet and stores it in a location if this is the first time a project is being created. This process happens only once. When the command is done running, we see a number towards the end of the logs. That is the default archtype number that our project would be based upon. We would be given an input. If we are to choose any archetypes by ourselves, we input that number and hit enter. Otherwise we just press enter for the default project setup.
- After that, we are given another choice of structure. An archetype may evolve over time to reflect current best practices. Choose a number that corresponds to the version of project that you'd like to adopt.


## The `groupId`, `artifactId`, `version` & `package`

- The `groupId` uniquely identifies your project across all projects. A group ID should follow Java's package name rules. Ex: `com.example.maven`, `edu.java`, etc. This isn't too strict a rule according to Maven standards since a lot of projects have been known to exist that have one-worded names. Yet, this is the Java-recommended way.
- The `artifactId` is the name of the jar without version. If you created it, then you can choose whatever name you want with lowercase letters and no strange symbols. If it's a third party jar, you have to take the name of the jar as it's distributed. Ex: `maven`, `commons-math`, etc.
- The `version` is exactly what it sounds like. If it's a third party artifact, you have to use their version number whatever it is, and as strange as it can look. Ex: `1.0.7`, `4.2.0`, etc. If the project you work on isn't yet complete, use the SNAPSHOT feature.
- The `package` option takes in the a directory within which everything files would be contained.


## Generating the First Maven Project

Here are the essential steps:
- Start with `mvn archetype:generate`.
- Choose the Maven archetype plugin.
- Choose the IDs, versions and package names.
- Confirm.
For this project:
- The `groupId` was `com.ragingcoffee`.
- The `artifactId` was `ragingcoffee`.
- The `version` was `1.0-SNAPSHOT`.
- The `package` was `com.ragingcoffee.deletethis` (subsequently, the `deletethis` directory was deleted and a lot others were added).


## Dependencies in `pom.xml`

Maven allows us to add dependencies to our projects without having to download the .jar files and ship them appropriately. This is done in the `pom.xml` file. It would have:
- `<project>` tags within which the entire file definition would be present.
- Within this tag, there would be `<dependencies>`. This tag would house all the dependencies our project would need.
- Within that tag, there would be `<dependency>`. This tag would list all individual inclusions to our projects and would have their `groupId`, `artifactId` & `version` as tags.
For reference, the `pom.xml` in this project ships with a JUnit4 dependency for tests. That is the only dependency as of now. To search for the code to include any fraework dependencies, a Google search is enough.
When the file gets saved with newer dependencies, the required files are automatically downloaded. If dependencies are removed, they get deleted automatically.


## The Maven Commands

The default project ships with a `target` directory that will compile every file into a `.class` file. It also stores any JAR files. We primarily would want to alter these binaries.
- At times we may want to start afresh or get rid of those binaries. Use `mvn clean` for such purposes. We can also combine commands such as `mvn clean compile`, etc.
- To compile test files, use `mvn test-compile`. In the `target` directory, a `test-classes` would appear.
- To run all test files and see results in the terminal, use `mvn test`. When we run this command, in the `target` directory a new `surefire-reports` directory gets added. In that directory, the test results get saved.
- To create a JAR file, do `mvn install`. This commands compiles, tests and then, if everything is perfectly done, creates the JAR file directly in the `target`folder.

The list of all standard commands:
- To check if all the build information is available or not, use `mvn validate`.
- To compile all source & test files, use `mvn compile`.
- To run all tests, use `mvn test`.
- To check if all the build information is available or not, use `mvn package`.
- To only create a JAR file and not care about any installations or dependency setups, use `mvn package`.
- To run integration tests, use `mvn integration-test`.
- To run checks to ensure if all project criteria are met, use `mvn verify`.
- To do both the actions mentioned for `package`, use `mvn install`.
- To share the repository for making it available for release in such an environment, use `mvn deploy`.


# The Maven Build Lifecycle

Maven bases it build process on the standard SDLC, making it easier for the developers to ship softwares. Te steps os development that it encourages correspond to the set of commands that you append to `mvn`:
1. `validate`
1. `compile`
1. `test`
1. `package`
1. `integration-test`
1. `verify`
1. `install`
1. `deploy`
With every command, all the previous commands also get hierarchically executed.


## Transitive Dependencies

- For every dependency that we add via the XML file, we get sub-dependencies of those dependencies that would also get added. The dependencies of other dependencies are known as transitive dependencies.
- Maven's transitive dependency allows you to simply define a dependency in the pom.xml and it will download all other dependencies it requires.
- For example, the JUnit added itself is dependent on Hamcrest. So both would get added for our project.
- To remove any transitive dependency for some reason, inculde these tags within the `<dependency>` in question:
    ```xml
    <exclusions>
        <exclusion>
            <groupId>...</groupId>
            <artifactId>...</artifactId>
        </exclusion>
    </exclusions>
    ```
The project may not work due to absence of dependencies.
- We may write for every dependency their scope inside `<scope>` tags. That allows Maven to know where the dependency is being used. The available options are: `test`, `compile` (the default), `runtime` (dependency only active at runtime), `provided` (lets Maven know that the scope is available just for the runtime).
