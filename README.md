# Raging Coffee

<div id="top"></div>
<span>
  <img src="https://img.shields.io/badge/Java-orange?style=for-the-badge&logo=java&logoColor=orange" />
  <img src="https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
  <img src="https://img.shields.io/badge/Docker-2CA5E0?style=for-the-badge&logo=docker&logoColor=white" />
  <img src="https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=Jenkins&logoColor=white" />
  <img src="https://img.shields.io/badge/Junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white" />
  <img src="https://img.shields.io/badge/Gitpod-000000?style=for-the-badge&logo=gitpod&logoColor=#FFAE33" />
</span>

<br /><br />

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/Diptonil/raging-coffee)

<br />

<span>

  ![GitHub CI](https://github.com/Diptonil/raging-coffee/actions/workflows/maven.yml/badge.svg)
  ![CodeQL](https://github.com/Diptonil/raging-coffee/actions/workflows/codeql.yml/badge.svg)
</span>

<br />


## Table of Contents

- [Description](#description)
- [Running the Programs](#running-the-programs)
- [Extra Dependencies](#extra-dependencies)
- [Checklist](#checklist)
- [Tests](#tests)
- [Further Reading](#further-reading)
- [Known Issues](#known-issues)
- [Resources](#resources)
- [Contributions](#contributions)


## Description

This project is geared towards the practical as well as theoretical exploration of the Java language in depth. Primarily, this is to serve as a checklist of my own knowledge in Java but since the best way to learn is to make something that others may learn from as well, this repository has been made public.<br />
This also deals with certain general problem solving and algorithmic programs as well as design patterns that is just for my own reference. Others are welcome to check those out as well, in any case. There are already more complete and better repositories out there that are more famous for the various implementations of algorithms using Java. This repository is more geared to focus on the nuances of the language in general, rather than recreate the same work.<br />
The project has NO dependencies.<br />
<a href="https://github.com/TheAlgorithms/Java">Here</a> is the link of the repository containing Java programs on algorithms.<br />
<a href="https://github.com/iluwatar/java-design-patterns">Here</a> is the link of the repository containing design patterns elucidated in an intuitive and resourceful manner by experienced and passionate engineers and experts.


<p align="right">(<a href="#top">Top</a>)</p>


## Running the Programs

Visual Studio Code with the extension `Language Support for Java (TM) by Red Hat` has been used. Sections for other IDEs such as IntelliJ or Eclipse shall be added if those environments bear certain feasilbility that deems their adoption over the present IDE.<br />
The required dependencies (JDK 17) have firstly been installed.<br />
Methods to run programs directly from Docker coming shortly. To run the programs from the terminal:
- From the directory in which the source file is stored:
  ```sh
  javac fileName.java
  ```
- From the root directory (exactly from within the `\src\main\java` directory):
  ```sh
  java com.ragingcoffee.directoryName.fileName
  ```

<p align="right">(<a href="#top">Top</a>)</p>


## Extra Dependencies

None of the dependencies mentioned below are a must for the project, except Maven to test (since it is purely educational and the programs are standalone, not a part of any application). Even these have been used for learning purposes (as well as making the project more accessible and standard) and their guides are in the `furtherreading` directory.
- **Apache Maven**: Project Management and build tool used to define a standard structure for the project. If code needs to be tested, however, Maven is to be used for convenience.
- **Jenkins**: Pipeline used to automatically build and test the code on a local server upon every push.
- **Docker**: Containerization application used to run the programs directly by running a container of an image without any worries about any dependencies.
- **Gitpod**: Running, editing and contributing to the projects are now simpler with Gitpod - an online, collaborative development platform. This allows users to run and test programs without using the project locally.
- **GitHub Actions**: Running automated workflows such as sending out greeting mails for contributions, standard CodeQL checks, etc. 

<p align="right">(<a href="#top">Top</a>)</p>


## Checklist

The list below is not to be followed in any particular order but is more of a record of what has been done and what is yet to be done.
- [x] Annotations
- [x] Inheritance
- [x] Interfaces
- [x] Enumerations
- [x] Multithreading
- [ ] Recursion (and the Divide and Conquer Technique)
- [ ] Dynamic Programming Technique
- [ ] Greedy Technique
- [x] Searching Techniques
  - [x] Binary Search
  - [x] Linear Search
  - [x] Jump Search
- [ ] Sorting Techniques
  - [ ] Bubble Sort
  - [ ] Selection Sort
  - [ ] Insertion Sort
  - [ ] Merge Sort
  - [ ] Radix Sort
- [x] Caching Algorithms
- [ ] General problems with multiple approaches
- [ ] Problem Solving
- [ ] Design Patterns
- [ ] Functional Style Programming
- [x] String Operations
- [ ] Data Structure Implementations
  - [ ] Arrays
  - [x] Linked Lists
  - [ ] Stacks
  - [ ] Queues
  - [ ] Trees
  - [ ] Heaps
  - [ ] Tries
  - [ ] Graphs
- The `java.net` Package
- The `java.io` Package
  - [ ] File Operations
- [ ] The `java.lang` Package
  - [x] The Reflection API
  - [x] The Wrapper API
- [ ] The `java.util` Package
  - [ ] The Collections API
  - [x] The Logging API
  - [ ] The Regex API
- [ ] The Spring Framework
  - [ ] Introduction to RESTful Services

<p align="right">(<a href="#top">Top</a>)</p>


## Tests

Incorporating tests in this repository for every program is a work in progress. Since this repo is more educational and exemplary, there are many classes that exist just to show the behaviour of certain in-built methods provided by the Java API. According to the rules of testing (as well as common sense), it is meaningless to test the use of the built-in API and is adviced against. This is why there would exist certain source files without any test files. For example, testing a program that uses the built-in sort that Java offers (`Arrays.sort()`) is meaningless and is not done. <br />
To run tests, Maven may be used. The corresponding command for Maven:
```sh
mvn test
```
JUnit5 has been used to write tests for this project. 

<p align="right">(<a href="#top">Top</a>)</p>


## Further Reading

Certain build tools and applications have been discussed here within the scope of their use in Java development. They may serve as a guide to understand how these tools integrate with Java, along with how they are used for development (this project is an example as well). These can be found under the `furtherreading` directory.
- [ ] Java Ecosystem
  - [ ] Concept of JDK
  - [ ] Concept of JRE
  - [ ] Concept of JVM
  - [ ] Hotspot JVM
  - [ ] OpenJDK
  - [ ] Java SE
  - [ ] Java EE
  - [x] Garbage Collection
  - [ ] Java Memory Model
- [x] Apache Maven
- [ ] Gradle
- [x] Jenkins
- [ ] JUnit5
- [x] Java Access Modifiers
- [ ] Java Conventions
- [ ] Java Keywords with Multiple Uses

<p align="right">(<a href="#top">Top</a>)</p>


## Resources

For this project, the amalgamation of the following books are used:
- **Java: The Complete Reference** by *Herbert Schildt*: Core content of the project and the explanations.
- **Clean Code: A Handbook of Agile Software Craftsmanship** by *Robert Cecil Martin*: Guide to write disciplined, maintainable and production-friendly code.
- **Head First Design Patterns** by *Bates Bert*, *Freeman Eric*, *Robinson Elisabeth* and *Sierra Kathy*: Intuitive methodology of programmatic design patterns for low-level design.
- **Test-Driven Development with Python: Obey the Testing Goat** by *Harry J.W. Percival*: A book written in Python elucidating the importance and guidelines to get started with Test-Driven Development as well as to learn to test code. Despite the language, the core concepts of testing have been covered appropriately.

<p align="right">(<a href="#top">Top</a>)</p>


## Recommended Resources

- <a href="https://google.github.io/styleguide/javaguide.html"><b>The Google Java Style-Guide</b></a>: Go through the documentation to understand the the correct way to write Java code.

<p align="right">(<a href="#top">Top</a>)</p>


## Contributions

- Refer to `CONTRIBUTING.md` first.
- Contribution rules are stringent to ensure community and project standards never regress. There may be multiple reviews and changes that get suggested to PRs. Contributors are expected to view this as a challenge rather than to turn away from it.
- No matter what, a PR must have a mapping to an issue. Otherwise, it would not be evaluated.
- A response to an Issue or a PR is guaranteed from the side of the maintainer, even if the same may not follow the proper format of contributing. This is a platform of learning accessible to everyone, after all.

<p align="right">(<a href="#top">Top</a>)</p>
