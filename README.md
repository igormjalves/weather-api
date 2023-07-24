# Weather API

Java API using Spring Boot, consisting in a weather Data API collected from a Open Weather API using a scheduled task. It is also possible to consult weather records by period.

## Table of Contents

  - [Introduction](#introduction)
  - [Installation](#installation)
  - [Usage](#usage)
  - [API Documentation (if applicable)](#api-documentation-if-applicable)
  - [Configuration](#configuration)
  - [Contributing](#contributing)
  - [Future Improvements](#future-improvements)

## Introduction

The goal is to create a job that queries a weather API at a configurable interval and records updated data for one specific city, in a PostgreSQL database. In addition, an endpoint was created to query the temperature records, allowing the user to specify a date range for the query.

## Installation

1. Clone the project
2. Check prerequisites: Java SDK 1.8, Apache Maven 3.X, Postgres 14, and an IDE (IntelliJ IDEA, Eclipse, VSCode).
3. Import as a Maven project
4. Build the project: Once the project is imported, build it using Maven:
<!-- -->
    mvn clean install

5. Run the project via IDE or Command Line:
<!-- -->
    mvn spring-boot:run

## Usage

### Get all the weather records
<!-- -->
    GET /api/weatherdata

    RESPONSE: 200 OK
    [
      {
        "id": 12444,
        "weatherStatus": "Clouds",
        "description": "nuvens dispersas",
        "dateTime": "2023-07-24T12:40:56",
        "temp": 27.29,
        "feelsLike": 29.75,
        "tempMin": 27.29,
        "tempMax": 27.29,
        "humidity": 74,
        "sunrise": "05:39:33",
        "sunset": "17:18:47",
        "city": "Maceió",
        "country": "BR"
      },
      ...
    ]

### Get the weather records in a date range (Date and Time)
<!-- -->
    GET /api/weatherdata/interval?startDateTime=24/07/2023+12:00:00&endDateTime=24/07/2023+15:00:00

    RESPONSE: 200 OK
    [
      {
        "id": 12444,
        "weatherStatus": "Clouds",
        "description": "nuvens dispersas",
        "dateTime": "2023-07-24T12:40:56",
        "temp": 27.29,
        "feelsLike": 29.75,
        "tempMin": 27.29,
        "tempMax": 27.29,
        "humidity": 74,
        "sunrise": "05:39:33",
        "sunset": "17:18:47",
        "city": "Maceió",
        "country": "BR"
      },
      ...
    ]

## API Documentation (if applicable)

[If your project exposes an API, provide detailed API documentation here. Include the endpoints, request parameters, response format, and any authentication required.]

## Configuration

[Explain any configuration options available for the project, along with how to set them. This could include environment variables, configuration files, or database setup.]

## Contributing

[Explain how others can contribute to your project. Include guidelines for submitting pull requests, reporting issues, and any coding standards you follow.]

## Future Improvements

[Specify the license under which your project is distributed. Choose an open-source license that suits your needs, and include the license text in a separate file if required.]
