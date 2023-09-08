# EnumStateMachina

This is a Spring Boot application that simulates a simple state machine using enums.

## Overview

The application consists of the following main components:

1. `StatusEnum`: This is an enum that represents the states of the machine. It has three states: RED, YELLOW, and GREEN, each transitioning to the next state in this order.

2. `StatusMachina`: This is a Spring component that holds the current state of the machine and provides a method to transition to the next state.

3. `Controller`: This is a Spring REST controller that provides two endpoints to interact with the state machine: one to get the current state and one to transition to the next state.

4. `EnumStateMachinaApplication`: This is the main application class that starts the Spring Boot application.

5. `ControllerIntTest`: This is a Spring MVC test for the `Controller` class.

## Installation

1. Make sure you have Java 8 or higher installed on your machine.

2. Clone the repository:
   ```
   git clone https://github.com/your-username/enum-state-machina.git
   ```
3. Navigate to the project directory and build the project:
   ```
   cd enum-state-machina
   mvn clean install
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```
   The application will start and listen on port 8080.

## Usage

The application provides two endpoints:

1. `GET /api/v1/state-machina/getStatus`: Returns the current status of the state machine.
   ```
   curl http://localhost:8080/api/v1/state-machina/getStatus
   ```
2. `GET /api/v1/state-machina/nextStatus`: Transitions the state machine to the next status and returns the new status.
   ```
   curl http://localhost:8080/api/v1/state-machina/nextStatus
   ```

## Running the Tests

To run the tests, execute the following command:
```
mvn test
```

