# Serenity JUnit Starter project


This is the simplest possible build script setup for Serenity BDD using Java. 

This is a very minimal sample project using JUnit and Serenity BDD in Java. 
You can use this project as a quick starting point for your own projects.

## Get the code

Git:

    git clone https://github.com/serenity-bdd/serenity-junit-starter.git
    cd serenity-junit-starter
    
    
Or simply [download a zip](https://github.com/serenity-bdd/serenity-junit-starter/archive/master.zip) file.

## Use Maven

Open a command window and run:

    mvn clean verify

## Use Gradle

Open a command window and run:

    gradlew test 


## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

##Cucumber 

##For Maven
 we’ll start by creating a new project directory with the cucumber-archetype Maven plugin. Open a terminal, go to the directory where you want to create your project, and run the following command:
`  
mvn archetype:generate                      \
   "-DarchetypeGroupId=io.cucumber"           \
   "-DarchetypeArtifactId=cucumber-archetype" \
   "-DarchetypeVersion=5.5.0"               \
   "-DgroupId=hellocucumber"                  \
   "-DartifactId=hellocucumber"               \
   "-Dpackage=hellocucumber"                  \
   "-Dversion=1.0.0-SNAPSHOT"                 \
   "-DinteractiveMode=false"
   `
   
  ##With Gradle
  
  One way to create this sample Cucumber project using Gradle is to convert the above generated Maven archetype into a Gradle project.
   
  Run the following command from the hellocucumber directory: 
   ` 
           gradle init 
   `
  
  Add the following Task to your build.gradle file:`  
  
  task cucumber() {
      dependsOn assemble, compileTestJava
      doLast {
          javaexec {
              main = "io.cucumber.core.cli.Main"
              classpath = configurations.cucumberRuntime + sourceSets.main.output + sourceSets.test.output
              args = ['--plugin', 'pretty', '--glue', 'hellocucumber', 'src/test/resources']
          }
      }
  }
  
  Verify Cucumber installation
  To make sure everything works together correctly, let’s run Cucumber.
  
  Maven:
  
  mvn test
  Gradle:
  
  gradle cucumber