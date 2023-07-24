# Weather API

Java API using Spring Boot, consisting in a weather Data API collected from a Open Weather API using a scheduled task. It is also possible to consult weather records by period.

## Table of Contents

  - [Introduction](#introduction)
  - [Installation](#installation)
  - [Usage](#usage)
  - [API Documentation (if applicable)](#api-documentation-if-applicable)
  - [Configuration](#configuration)
  - [Contributing](#contributing)
  - [Bugs and Issues](#bugs-and-issues)
  - [License](#license)
  - [Acknowledgements](#acknowledgements)

## Introduction

The goal is to create a job that queries a weather API at a configurable interval and records updated data for one specific city, in a PostgreSQL database. In addition, an endpoint was created to query the temperature records, allowing the user to specify a date range for the query.

## Installation

1. Clone the project
2. Check prerequisites: Java JDK, Apache Maven, IDE (IntelliJ IDEA, Eclipse, VSCode).
3. Import as a Maven project
4. Build the project: Once the project is imported, build it using Maven:
<!-- -->
    mvn clean install

5. Run the project via IDE or Command Line:
<!-- -->
    mvn spring-boot:run

## Usage

[Explain how to use the project, including examples and explanations of available features. If it's a web application, provide the URL to access it. If it's a library or API, include code samples and guidelines.]

## API Documentation (if applicable)

[If your project exposes an API, provide detailed API documentation here. Include the endpoints, request parameters, response format, and any authentication required.]

## Configuration

[Explain any configuration options available for the project, along with how to set them. This could include environment variables, configuration files, or database setup.]

## Contributing

[Explain how others can contribute to your project. Include guidelines for submitting pull requests, reporting issues, and any coding standards you follow.]

## Bugs and Issues

[If you have known bugs or issues, provide a link to the issue tracker or describe how users can report problems they encounter.]

## License

[Specify the license under which your project is distributed. Choose an open-source license that suits your needs, and include the license text in a separate file if required.]

## Acknowledgements

[List any individuals, projects, or resources that you want to acknowledge for their contributions or support in your project.]
