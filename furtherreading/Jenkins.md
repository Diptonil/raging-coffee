# Jenkins

Jenkins is a build automation tool that is used frequently in DevOps to establish deployment pipelines and automate builds using CI principles. It was written in Java. In the successive sections, this tool shall be further explored. Sample projects that have various use-cases would be explored. However, there would be no discussion about installation and configuration of the software.


## What is CI?

This process is also referred to as Build Automation. Basically, an exclusive server (called the CI server) sits at a place with the sole job of checking in newly pushed code and building it up without any manual intervention. Thus the process is automated and always bound to happen. There can be additional steps that may be done to make the process more sophesticated such as running tests before starting builds, deploy automatically immediately after build process (this is called CD). These are optional, however.


## Why Choose Jenkins?

- Very popular in DevOps field. This ensures a large community and support.
- Large development support and extensive scope due to Jenkins plugins.
- Continuously provodes access to working copies of software, thus supporting the Agile development process.


## Why Automate Builds?

- To not let web applications face any downtime everytime a new feature is rolled out and site is redeployed.
- To have immediate bug detection at the time of build.
- Remove the Integration phase by automating it in the SDLC.
- Keep the project at a deployable state at all times (especially required for web or mobile apps).
- Detect and notify about builds and development in advance.


## Sample Projects List

The guide walks through setting up an appropriate Jenkins jobs for the following types of projects, starting from simple instances going over to advanced situations:
1. Build a HelloWorld Java file periodically.
1. Build a HelloWorld Java file remotely.
**NOTE**: Every topic subheading from hence having a number in parenthesis would mean that the topic deals with the corresponding project.


## Starting Up Jenkins (1)

When everything is configured and we have the username and password to run the CI server of Jenkins on our Localhost (at port 8080), we move on with the creation of our first sample job (assume that you have a sample project that has a simple Java program to build):
- Create `New Item`.
- Set a name for the project.
- We get a plethora of options to choose from now and each have their description. As of now, for the sake of a sample project, we choose the `Freestyle Project`.
- We would be taken to set up the configurations. There we are to fill up the basic details about the project that is being done.
  - We mostly leave out the trickier details for the first time around.
  - When asked about `Source Code Management`, we choose `None`.
  - When asked about `Build Triggers`, choose `Build Periodically`. The input for the field is a cron job (help can be found out in the website itself on '?'). Just for clarity, we choose `* * * * *` (we may never do that in real projects).
  - When asked about `Build Environments`, leave out everything.
  - When asked about `Build`, choose the command that works for your system. To run a Java file, we may say something like:
  ```sh
  cd /home/directory/javaFolder
  javac Sample.java
  java Sample
  ```
  (Spoiler alert: There is great chance that the build would fail on a Linux machine. We'll get to it in a while)
  - All that done, we save the configuration.
- Anytime we want to modify the configuration that we just did, we can go to `Configure` in the left panel (provided we are looking at the project that we just created).
**NOTE**: A very important thing to realize is that this step of starting up and setting up Jenkins for a project would be different for different kinds of tasks we want to do according to what we are developing.


## The Project Section

- Everytime we start up Jenkins we come across all the porjects that we are doing, clicking on one of them would lead us to the project section for each of them. Here we see our project, the general descriptions and everything like that that we gave them.
- In the bottom-left we have the `Build History` section. That shows us all the previous builds (that are automated, we don't need to signal them in any way).
- A red icon would mean that the build has failed. A blue icon would mean success.
- Clicking on the build that we want to access shows us all relevant info about it. We can go to `Console Output` (to the left) option to check out in case of any failures.


## Granting a Linux Machine Privileges

- Jenkins doesn't have privileges on a Linux machine by default. We have to explicitly tell the system about it.
- This is the reason why the first build job constantly failed.
- In terminal:
```sh
sudo vi /etc/sudoers
```
After this, add a line to the end of the file and save it:
`jenkins ALL=(ALL) NOPASSWD: ALL`
- This solves the privilege problem. While executing a Jenkins command, however, mention `sudo` before `javac`.
**NOTE**: After waiting for another build to run after fixing all these potential errors, when we finally see a succesful build, we go and examine the `Console Output`. We would be able to see the program run in the console output.


## Trigerring Remote Builds (2)