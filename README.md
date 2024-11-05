# Hello World Hex Java

[![Build Status](https://github.com/adambonsu/hello_world_hex_java/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/adambonsu/hello_world_hex_java/actions/workflows/ci-cd.yml)

Hello World Hex Java is a simple Java project that demonstrates the principles of Hexagonal Architecture (also known as Ports and Adapters) using a "Hello World" example.

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Hexagonal Architecture Overview](#hexagonal-architecture-overview)
- [Development](#development)
- [Contributing](#contributing)
- [License](#license)


## Installation

To use this project, you need to have Java 11 or higher and Maven 3.6 or higher installed on your system.

1. Clone the repository:
```bash
git clone https://github.com/adambonsu/hello_world_hex_java.git

```

2. Navigate to the project directory:
```bash
cd hello_world_hex_java

```
3. Build the project:
```bash
mvn clean package

```


## Usage

After building the project, you can run the application using:

```bash
java -jar target/hello-world-hex-java-1.0-SNAPSHOT.jar

```
By default, this will output: “Hello, World!”
To greet a specific name, you can pass it as a command-line argument:
```bash
java -jar target/hello-world-hex-java-1.0-SNAPSHOT.jar Makeda

```
This will output: “Hello Makeda”

## Hexagonal Architecture Overview
Hexagonal Architecture, also known as Ports and Adapters, is a software design pattern that aims to create loosely coupled application components. It separates the core logic of an application from its external concerns.

Key components in this architecture are:
1.	Core: Contains the main business logic (`GreetingService`)
2.	Ports: Interfaces that define how the core interacts with the outside world (`GreetingUseCase`, `GreetingRepository`)
3.	Adapters: Implementations of ports that handle external interactions (`CliAdapter`, `InMemoryGreetingRepository`)

Benefits of this architecture include:
* Separation of concerns
* Improved testability
* Flexibility to change external components without affecting the core logic


## Development

### Static Tests
SpotBugs is a static code analysis tool for Java projects. SpotBugs is the successor to FindBugs and is widely used in the Java community.
To run SpotBugs locally, use the following Maven command:
```bash
mvn spotbugs:check

```

### Running Functional Tests

This project includes functional tests using TestNG. To run the tests:
```bash
mvn clean test

```
This will compile the code and run all TestNG tests, including the functional tests.

The test results will be available in the `target/surefire-reports` directory.

### Functional Test Structure

The functional tests are located in:
`src/test/java/com/example/functional/HelloWorldFunctionalTest.java`

This test class simulates the output of the Hello World application and verifies it against the expected output.


### Customizing Functional Tests

To add more functional tests:

1. Create new test methods in the `HelloWorldFunctionalTest.java` file.
2. Implement the `getHelloWorldOutput()` method to actually run your application and capture its output.
3. Add any new test classes to the `testng.xml` file located in `src/test/java/com/example/testng.xml`.


## CI/CD Functional Test Integration
The project is configured to run these tests automatically on GitHub Actions. Every push and pull request will trigger the test suite. You can view the results in the "Actions" tab of the GitHub repository.



### Running Security Tests

This project includes security tests using spotbugs with the FindSecBugs plugin. To run the tests:
```bash
mvn spotbugs:check

```
This will run SpotBugs and fail the build if any security issues are found.

To generate an HTML report, use:
```bash
mvn spotbugs:gui

```
This will create an HTML report in the `target/spotbugsXml.xml` file.

### CI/CD Security Test Integration

This project is configured to run SpotBugs automatically on GitHub Actions. Every push and pull request will trigger the security analysis. You can view the results in the "Actions" tab of the GitHub repository.

If any security issues are found, the SpotBugs report will be uploaded as an artifact and can be downloaded for further analysis.


## Contributing
Bug reports and pull requests are welcome on GitHub at https://github.com/adambonsu/hello_world_hex_java. This project is intended to be a safe, welcoming space for collaboration, and contributors are expected to adhere to the [Contributor Covenant](https://www.contributor-covenant.org/) code of conduct.

## Licence
The project is available as open source under the terms of the [MIT License](https://opensource.org/license/MIT).
