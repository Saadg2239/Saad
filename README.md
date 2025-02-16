# Introduction 
This project is a comprehensive suite of automated tests for the check survey application. The tests are written in Java and use the TestNG testing framework. The project aims to ensure the quality and reliability of the check survey application by covering many of its functionalities with automated tests.

# Getting Started
### Prerequisites
- Java Development Kit (JDK) 8 or later
- Maven
- An IDE that supports Java, such as IntelliJ IDEA or Eclipse

### Installation
1. Clone the repository to your local machine.
2. Open the project in your IDE.
3. Build the project using Maven. This can usually be done in the IDE or by running `mvn clean install` in the project directory from the command line.

## Running the Tests
The tests can be run directly from the IDE or from the command line using Maven. To run the tests from the command line, navigate to the project directory and run `mvn test`.

## Contributing
Contributions are welcome. Please fork the repository and create a pull request with your changes.

## Project Structure

The project follows a standard Maven project structure. Here's a brief overview of the main directories and files:

- `src/main/java`: This directory contains the main source code for the project. It is further divided into packages based on functionality.

- `src/test/java`: This directory contains all the test classes. The tests are organized into packages that mirror the main source code structure. Each class in the `src/main/java` directory has a corresponding test class in this directory.

    - `Tests`: This package contains all the test classes. Each class represents a different feature or component of the application that is being tested.

- `TestData`: This directory contains JSON files with test data used in the tests.

- `Utils`: This package contains utility classes that provide common functionality used across multiple tests.

- `pom.xml`: This is the Project Object Model (POM) file for Maven. It includes the project configuration, dependencies, plugins, and other details.
