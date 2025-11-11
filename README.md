# Stub Service

Simple Java Spring Boot service to manage WireMock stubs programmatically. The service contains a `WiremockManager` component that can create stubs from a request model and reset all configured stubs.

## Tech stack

- Java (JDK 11+ recommended)
- Spring Boot
- WireMock
- Maven

## Prerequisites

- macOS (development)
- JDK 11 or newer
- Maven 3.6+
- IntelliJ IDEA (optional)

## Build

Run from project root:

    mvn clean package

## Run

Run with Maven:

    mvn spring-boot:run

Or run generated jar:

    java -jar target/*.jar

## Usage

The application exposes a service-level `WiremockManager` that other application components can call to register stubs and reset them.