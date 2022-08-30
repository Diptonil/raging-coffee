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


## Sample Use-Cases List

The guide walks through setting up an appropriate Jenkins jobs for the following types of projects, starting from simple instances going over to advanced situations:
1. Build a HelloWorld Java file periodically.
1. Build a HelloWorld Java file remotely.
1. Chaining a Jenkins job to build, run and display a success message for a Java file.
1. Build files from a Git repository periodically.
1. Build files from a Git repository upon every new push.
1. Set Up a Maven project.
1. Build a project and send email alerts.
1. Build a pipeline using pipeline script to package a Maven project.
1. Build a pipeline using pipeline script from SCM to package a Maven project.<br />
**NOTE**: Every topic subheading from hence having a number in parenthesis would mean that the topic deals with the corresponding project.


## Basic Commands

- The CLI can be used for some basic instructions. Run all the commands from the folder containing the jenkins.exe file.
- To start Jenkins:
```sh
jenkins.exe start
```
- To restart Jenkins:
```sh
jenkins.exe restart
```
- To stop Jenkins:
```sh
jenkins.exe stop
```


## Starting Up Jenkins (1)

When everything is configured and we have the username and password to run the CI server of Jenkins on our Localhost (at port 8080), we move on with the creation of our first sample job (assume that you have a sample project that has a simple Java program to build):
- Create `New Item`.
- Set a name for the project.
- We get a plethora of options to choose from now and each have their description. As of now, for the sake of a sample project, we choose the `Freestyle Project`. If we wish to copy the configurations of some existing Jenkins job into our new job to save time, we do that by entering the name of the job in the bottom-most option of `Copy from`.
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
- Anytime we want to modify the configuration that we just did, we can go to `Configure` in the left panel (provided we are looking at the project that we just created).<br />
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
- This solves the privilege problem. While executing a Jenkins command, however, mention `sudo` before `javac`.<br />
**NOTE**: After waiting for another build to run after fixing all these potential errors, when we finally see a successful build, we go and examine the `Console Output`. We would be able to see the program run in the console output.


## Users in Jenkins

- For a project, there may be many members associated. Each should ideally have their own User setup configured. Different jobs would be relative in importance to different people. The DevOps members have their own types of builds to run, the developers would be concerned with different files and jobs to manage, etc.
- Go to `Manage Jenkins`. In that we can manage user accounts. We can create new accounts and login through them. The small arrow below the name is an icon that we can use to customise user profile, change passwords, etc.
- By default, the new users have the same degree of access as the admin, which is undesirable. We have plugins to prevent such instances.
- Go to `Plugin Manager` in `Manage Jenkins`. Under `Available Plugins`, we have `Role-based Authentication Strategy`. Install it and restart Jenkins.
- A `Role` is a parameter that can be assigned to any user that defines a set of protocols as to the accessing of any particular file or running a job, etc.
- As the admin, go to `Configure Global Security` under `Manage Jenkins`. Check `Role-based Authentication` and `Enable Security`.
- As the admin, go to `Manage and Assign Roles` under `Manage Jenkins`. We have `Manage Roles`, `Assign Roles` and `Role Strategy Macros`. Go to the first option.
- We have Global Roles. Many roles are there that we can grant access to a certain type of user. We can add roles as well and project-based roles as well. For them, we can select a pattern so that any Jenkins job name starting or ending or containing certain characters might be accessible to a certain type of user. We can add project roles such as testers, interns, etc.
- In `Assign Roles`, we assign roles to users.


## System Environment

- In `System Environment` in `Manage Jenkins`, we can make some required configurations with respect to paths and global settings.
- We can see the Jenkins home directory from here. We can change the `JENKINS_HOME` variable to alter the location. The instructions to change the directory are given.
- System message supports HTML tags as well. It is displayed at the top of the Jenkins home page. It serves as a sort of reminder.
- Number of Executors signigy the number of jobs that may run parallelly.
- Quiet Period determines the wait time in seconds between builds. Sometimes this needs to be increased because it may take the system some time to set up certain things when the project is coming from Git or Mercurial.
- SCM Checkout Retry Count basically specifies the number of times an attempt to connect to GitHub will be made in case connection fails.
- Restrict Project Naming option is used to create Job naming conventions.
- We can mention our environment variables from Global Properties.
- Time format settings can be changed using Timestamper.
- We can also make changes with respect to GitHub servers, SMTP servers and Jenkins instances.
- We can also access Plugin settings from here.


## Trigerring Remote Builds (2)

- In case we have to trigger remote builds of something simple (like a Java file), we follow all the steps as before except some changes.
- In `Build Triggers`, we switch from `Run periodically` (uncheck it) to `Trigger builds remotely` (check it).
- Take note of a certain URL: `127.0.0.1:8080/job/projectName/build?token=chosenToken`
- We are assuming that the application runs at port 8080 (configurable at the installation). `127.0.0.1` is the Localhost.
- The `projectName` is the name of the project. The `chosenToken` is the token that you put in the input field.
- When the URL is entered, the build occurs after authentication.
- We use the same configuration and commands as we did in the first use-case.


## Chaining Jobs (3)

- We configure a very trivial workflow in Jenkins in which we have different jobs to build, run and display a success messga eif the build succeeds.
- We name the jobs as `job1`, `job2` and `job3` (for example).
- The command for the first job:
```sh
cd /home/directory/javaFolder
javac Sample.java
```
- The command for the second job:
```sh
cd /home/directory/javaFolder
java Sample
```
- The command for the third job:
```sh
echo "Job succeeded!"
```
-  For `job1`, in `Build Triggers`, we select the previous normal options that would trigger the build (either periodically or by using manual intervension). 
- For `job2`, in `Build Triggers`, we select `Build after other projects are built (trigger only if build is stable)`. We may choose to trigger the job even if the build is unstable. Depends totally on the type of workflow considered. We watch the `job1` project.
- For `job3`, in `Build Triggers`, we select `Build after other projects are built (trigger only if build is stable)`. We watch the `job2` project.
- Run the first job by clicking `Build Now`. All the chained jobs run succesfully.


## Integration With Git (4)

- We assume that we have a Git repository within which we have some files (Java source files in this case).
- We check the option that says `GitHub project` and provide the URL.
- Create a new Job. In `Source Code Management` choose Git. Enter the URL and the branch to detect. Set the `Build Triggers` to `Poll SCM` and set the cron job accordigly.
- The difference between `Poll SCM` and `Build Periodically` is that the former works with version control systems only and the latter works with local files.
- Since the Job this time requires a connection to the GitHub repo, things would be different. The files to be build are not locally there. They are coming from an external source. Internet connection is required. We set the command as:
```sh
javac Sample.java
java Sample
```
- When the build is succesful, we go the the `Console Output` to examine what happened. We can also see that the command is quite different this time. We are not changing directories.
- We see that the repo is being cloned into a folder inside the Jenkins directory. That is the default space of operation for any Jenkins job. If we do not change directories, that is the place where everything takes place. When we are building projects from the local system, only then do we need to change the directory compulsorily.
Of course, if we would want the repository to be cloned some place else, we just change the directory accordingly.
- The files stay there after the build is finished. In any case, we may want to delete all the files before proceeding with the next build. If that is the case, we check the `Delete workspace before build starts` option in `Build Environment`.


## Building Upon Push to GitHub (5)

- Consider the same example as above. This time, we just have to trigger a Jenkins Build everytime a push is done.
- Set the Jenkins `Build Triggers` to `Build when a change is pushed to GitHub`.


## Setting Up a Maven Project (6)

- Assume we have a Maven project that we need to build using Jenkins. We create a new job and go for `Freestyle Project`.
- We configure it according to the type of project we have (GitHub or local).
- In the `Build` section, we `Invoke top-level Maven targets`.
- In the `Goals` section of it, we specify the Maven commands that we would like to execute. For testing purposes, we can go with `clean build` in the input-box.
- The `Advanced` section is for specifying the path to the POM file, JVM options, etc.
- We save the configurations. Particular to this case, the output of `SUCCESS` is shown when all tests pass in the Maven project.


## Configuring EMail Alerts

- We need to utilize an SMTP server to send emails via Jenkins. To use the free service of GMail, we need to use smtp.gmail.com server.
- `Manage Jenkins` has the option of configuring the Email notifications. The `Default user email suffix` is `@gmail.com`. The server is mentioned above.
- Click on the `Advanced` section. Mention the email ID and password of it from which we are to send the email notification. Generally for larger projects there is a special account created for handling such events. We use SSL. Set up the port to the number that is provided by the SMPT server. For the Gmail SMTP, it is `365`.
- To ensure if the service has been set up properly, we click on `Test Configuration` after giving a test recipient. If an email is sent, the configuration is proper.
- In case the test isn't passing, it is most likely because the sender's GMail account doesn't have the `Allow less secure apps` set. We may also use a 2-factor authentication system by GMail and getting a special key for allowing such services to work.
- This procedure is backdated because the email that is sent canot be edited. The boilerplate may not be understood at all times as well. We need a system to send emails whose contents we can rig up ourselves. The `Editable Email Notifications` is a plugin.
- `Manage Jenkins` has the option of configuring the Extended Email notifications. 


## Sending Email Notifications (7)

- Choose any random project to build. In the configuration page of the job, go to `Post-build actions`. Select `Email notifications` from the dropdown.
- We select the recipients to send the mail to when the build fails.
- In case we want to use the plugin, in the configuration page of the job, go to `Post-build actions`. Select `Extended email notifications` from the dropdown. We can add in a bunch of additional settings here.


## Jenkins Pipeline

- It is a mechanism that allows us to leverage Continuous Delivery using Jenkins by having our code pushed to the target repository from which Jenkins would build, test and automatically deploy the new version of the code to the server (if any) reliably in an error-prone manner.
- A Pipeline is a series of tasks that happens consecutively upon successive completion of tasks that aim to achieve a larger goal than something as simple as just a build.
- The definition of a pipeline requires a `Jenkinsfile`. That can be done by using a declarative or a scripted syntax. The declarative approach is favoured because it makes the Jenkins code more readable and easier to write. It also provides richer syntax over the scripted approach.
- Instead of creating a `Freestyle Projects`, we create a `Pipeline`.


## The Declarative Syntax

- Every script begins with a `pipeline` keyword.
- We then specify the `agent`s (with the same keyword). The agent is the entity on which the pipeline would get executed.
- We then would define the `stages`. Inside that woud define individual `stage`s of (say) building, testing, deploying, etc. The stage as such doesn't really need to be a specific keyword. It can be something that describes what exactly is happening there. Consult the example below.
- Then within that we would define the `steps` that we need to take. Within this, we use the term `sh` if we are working on Linux or `bat` if we are working on Windows.


## Simple Pipeline (8)

- We create a simple Jenkins job with a GitHub repository first using some previously mentioned configuration. The only difference is that we do not go for `Freestyle Project` anymore. We go for `Pipeline`s.
- In `Advanced Project Options`, we have the `Pipeline`. This use-case involves building a pipeline from `Pipeline script`.
- Assume that we have a pipeline that clones a Maven project in a Linux machine and builds it up successively. We need to have Maven installed, of course. The pipeline script that we would put is:
```
pipeline {
  agent all
  stages {
    stage('initialize') {
      steps {
        sh 'git clone https://github.com/Diptonil/raging-coffee.git'
        sh 'mvn clean -f raging-coffee'
      }
    }
    stage('test') {
      steps {
        sh 'mvn test -f raging-coffee'
      }
    }
    stage('deploy') {
      steps {
        sh 'mvn package -f raging-coffee'
      }
    }
  }
}
```
- It is worth noting that such a simple task doesn't need a pipeline but it has been shown here in such a way for all purposes of brevity.
- When we build the job, we can see in green boxes the stages of our build. Upon hovering, we can see the build stages. Red boxes would mean failure. Upon hovering we can also access the logs.
- If we try to run the pipeline once again, however, the `git clone` command would produce errors because the directory would already be existing. To rectify that behaviour, we use this line before running the clone command: `rm -rf raging-coffee`.


## Simple Pipeline with SCM (9)

- We repeat the same outcome as previously obtained but using a `Jenkinsfile` that has already been committed in our Git repo.
- Copy and paste the entire script made previously into a `Jenkinsfile` located at the root of the directory. There are certain changes that needs to be made.
- This offers a much more sophesticated approach for creating pieplines.
- The script here would look like:
```
pipeline {
  agent all
  stages {
    stage('clean') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('deploy') {
      steps {
        sh 'mvn package'
      }
    }
  }
}
```
- We do not need to make any mention of directory changes since everything that gets executed is within the root folder of the project that gets built in the system at the root of the repo.
- No need for cloning or any other Git commands because that process would happen by default.
- Now select `Pipeline script from SCM` and select Git. Fill up the details and save. Keep script path set to `Jenkinsfile` if the same is at the root of the directory. If not, the path should be mentioned.
- Now we can build and see the results.
- This is the configuration that is used by this project as well because all that is required for this repository is to check if all programs are getting compiled without errors. Tests would be included soon as well. The Jenkinsfile for this repo can be checked out for more details.


## Slaves & Masters

- At times, having just a single machine locally to run builds or deployments is not enough for all purposes (majority of purposes, in fact). If we are building a large project, one server may not be sufficient to handle the load of the entire project. We would want to go for using Slave nodes in such cases.
- We would need a separate system to be the node. The launch method would depend on the type of system chosen. The slave instance must have Java 8 or more installed for success.
- Under `Manage Jenkins`, we have `Manage Nodes`. We already have a master node.
- For a slave node, go for SSH from the master node to the slave node. Add a new node. Provide all the configurational details. The fields are pretty much explanatory and have been discussed before as well.
- Labels are to group the nodes together into an unit for classification purposes.<br />
**For Linux**
- Select the `Launch Method`. For Linux machines, select `via SSH`. Set the IP of the Host (the slave) and add credentials and verification strategies.
- Leave `Require manual verification` as unchecked.
- As such, upon creation, the node is expected to be offline. To start, we go for the `Launch Node` option. We should see a success message if the connection is done. We must be sure to have connection settings set as such the SSH connection can be succesful between the machines.
- We can test our connection to the new node as well by making a Jenkins job that does that. In configurations we can choose the node to run the job in. This is often ideal for very big projects.<br />
**For Windows**
- Firstly, go to `Manage Jenkins` and then `Configure System`. Replace `localhost` with the current IP address.
- Repeat similar instructions as the previous method, except in `Launch Method`, use `Launch agent via Java web start` (if the option is unavailable, configure Agents in the Global Security settings to `Random`).
- We save the configurations and see the Windows agent be created. Follow the steps already given in Jenkins to connect to the agent (save agents.jar file inside the Jenkins folder before proceeding with the cmd command).
- Upon establishment of connectionn, we see a `Connected` prompt.