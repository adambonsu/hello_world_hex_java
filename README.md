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

### Functional Tests
To run the tests, use the following command:
```bash
mvn test

```
You can also use your preferred IDE to develop and run the project.

## Contributing
Bug reports and pull requests are welcome on GitHub at https://github.com/adambonsu/hello_world_hex_java. This project is intended to be a safe, welcoming space for collaboration, and contributors are expected to adhere to the [Contributor Covenant](https://www.contributor-covenant.org/) code of conduct.

## Licence
The project is available as open source under the terms of the [MIT License](https://opensource.org/license/MIT).
