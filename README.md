﻿# secondhand-web-selenium-cucumber

### Project Overview:

The project is created for Challenge 7 of the Binar Academy x SYNRGY Academy QA bootcamp batch 6. Created by Shidqi Adiatma a.k.a Hipstertester.

Demo: https://www.youtube.com/watch?v=B9IFysSqn38

- **Project Name:** secondhand-web-selenium-cucumber
- **Group ID:** secondhand.binar
- **Artifact ID:** secondhand-web-selenium-cucumber
- **Version:** 1.0-SNAPSHOT
- **Web:** https://secondhand.binaracademy.org/

### Dependencies:

1. **Cucumber:**
    - `io.cucumber:cucumber-java:7.14.1`
    - `io.cucumber:cucumber-testng:7.14.1`

2. **Java Faker:**
    - `com.github.javafaker:javafaker:1.0.2`

3. **Selenium:**
    - `org.seleniumhq.selenium:selenium-java:4.15.0`
    
4. **WebDriverManager:**
    - `io.github.bonigarcia:webdrivermanager:5.6.2`

5. **SLF4J (Simple Logging Facade for Java):**
    - `org.slf4j:slf4j-simple:2.0.9` (used in the 'test' scope)

6. **ExtentReports Cucumber7 Adapter:**
    - `tech.grasshopper:extentreports-cucumber7-adapter:1.14.0`

### Java and Maven Configuration:

- **Java Version:**
    - Source and target compatibility set to Java 20.

- **Maven Compiler Plugin:**
    - Version 3.11.0

- **Surefire Plugin:**
    - Version 3.0.0-M5
    - Configured to run TestNG tests specified in the `testng.xml` file.
    - Uses Maven properties, including the suite XML file (`testng.xml`).


## Folder Structure

<br/>The folder structure is as following:

    secondhand-web-selenium-cucumber
    ├─ report
    ├─ src
        ├─ main     
            ├─ java\com\shidqiadiatma
                ├─ factories             # Browser & driver manager
                ├─ helpers               # Java faker & keyword selenium
        ├─ test
             ├─ java\com\shidqiadiatma
                ├─ features              # Gherkin test cases 
                ├─ pages                 # Page object
                ├─ runners               # Testng runner
                ├─ steps                 # Step definitions
            ├─ resources
    ├─ target                            # Reports are generated in the target/reports directory
    ├─ .gitignore
    ├─ pom.xml
    ├─ README.MD
    ├─ testng.xml

## Getting Started

To get started, follow these simple steps:

1. Clone the repository to your local machine.

```bash
git clone https://github.com/shidqiadiatma/secondhand-web-selenium-cucumber.git
```

## How to Run
2. Using Maven CLI
```bash
mvn test
```

## Reporting
I'm using extentreport for reporting, <br>
and file report will be generated on directory 'target/reports',
