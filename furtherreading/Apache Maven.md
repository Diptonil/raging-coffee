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
- The `package` was `com.ragingcoffee.deletethis` (subsequently, the `deletethis` directory was deleted).
