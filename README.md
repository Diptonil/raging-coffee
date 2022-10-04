# Raging Coffee

<div id="top"></div>
<span>
  <img src="https://img.shields.io/badge/Java-orange?style=for-the-badge&logo=java&logoColor=orange" />
  <img src="https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
  <img src="https://img.shields.io/badge/Docker-2CA5E0?style=for-the-badge&logo=docker&logoColor=white" />
  <img src="https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=Jenkins&logoColor=white" />
  <img src="https://img.shields.io/badge/Gitpod-000000?style=for-the-badge&logo=gitpod&logoColor=#FFAE33" />
</span>

<br />

<span>

  [![codeql java][codeql java img]][codeql java]

</span>

<br />

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/Diptonil/raging-coffee)


## Table of Contents

- [Description](#description)
- [Running the Programs](#running-the-programs)
- [Extra Dependencies](#extra-dependencies)
- [Roadmap](#roadmap)
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

None of the dependencies mentioned below are a must for the project (since it is purely educational and the programs are standalone, not a part of any application). Even these have been used for learning purposes (as well as making the project more accessible and standard) and their guides are in the `furtherreading` directory.
- **Apache Maven**: Project Management and build tool used to define a standard structure for the project.
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
- [ ] Well-known array algorithms and problem-solving techniques.
- [ ] Recursion
- [ ] Divide and Conquer Technique
- [ ] Dynamic Programming Technique
- [ ] Greedy Technique
- [ ] Searching Techniques
- [ ] Sorting Techniques
- [x] Caching Algorithms
- [ ] General problems with multiple approaches
- [ ] Problem Solving
- [ ] Design Patterns
- [x] String Operations
- [ ] Data Structure Implementations
- [ ] File Operations
- [x] The Reflection API
- [ ] The `java.lang` Package
- [ ] The `java.util` Package

<p align="right">(<a href="#top">Top</a>)</p>


## Further Reading

Certain build tools and applications have been discussed here within the scope of their use in Java development. They may serve as a guide to understand how these tools integrate with Java, along with how they are used for development (this project is an example as well). These can be found under the `furtherreading` directory.
- [x] Apache Maven
- [ ] Docker
- [ ] Gradle
- [x] Jenkins
- [ ] JUnit5
- [x] Java Access Modifiers
- [x] Java Conventions
- [ ] Java Keywords with Multiple Uses

<p align="right">(<a href="#top">Top</a>)</p>


## Known Issues

- Refactor on the basis on keyword and brackets separation.
- Refactor on the basis of Java array [] convention.
- Order imports.
- Apply join() for every multithreading program.
- Folder renaming.
- Document everything.
- Correct grammar of *its* and *it's*.
- Apply backticks for every Java proper noun.
- Complete Prime Numbers and Insertion Sort.
- Space after every `catch`.
- Fix `TypeAnnotations.java`.
- Work on the Dockerfile.
- 0 to 19 for caching in main memory.

<p align="right">(<a href="#top">Top</a>)</p>


## Resources

For this project, the resources referred to are:
- **Java: The Complete Reference** by *Herbert Schildt*.
- **Clean Code: A Handbook of Agile Software Craftsmanship** by *Robert Cecil Martin*.
- **Head First Design Patterns** by *Bates Bert*, *Freeman Eric*, *Robinson Elisabeth* and *Sierra Kathy*.

<p align="right">(<a href="#top">Top</a>)</p>


## Contributions

- Refer to `Contributing.md` first.
- Comments in the programs are sparingly used because, as Uncle Robert would say, comments are just an excuse to pass on poorly-written code. Sufficiently comprehensive variable names have been taken in most cases and thus comments should never be an issue.

<p align="right">(<a href="#top">Top</a>)</p>