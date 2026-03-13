# School Management System (Spring Boot)

## Overview

The **School Management System** is a backend application built using Java and Spring Boot to manage core school operations such as student records, teacher management, classes, and course enrollment.

This project was created to **improve my backend development skills** and to practice building scalable **RESTful APIs** using modern Java frameworks.

---

## Features

* Student registration and management
* Teacher management
* Course and class management
* Student enrollment into courses
* CRUD operations for school resources
* RESTful API architecture
* Error handling and validation

---

## Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* PostgreSQL or MySQL
* Maven
* Docker (optional for containerization)

---

## Project Structure

src/main/java/com/example/school

* controller – Handles HTTP requests
* service – Business logic
* repository – Database interaction
* model – Entity classes
* dto – Data transfer objects
* config – Application configuration

---

## Prerequisites

Before running this project, ensure the following are installed:

* Java 17
* Maven
* Git

Verify Java installation:

```bash
java -version
```

You should see something similar to:

```
openjdk version "17"
```

Verify Maven installation:

```bash
mvn -version
```

---

## Installation

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/school-management-system.git
```

Navigate into the project directory:

```bash
cd school-management-system
```

---

### 2. Build the Project

Use Maven to compile and package the application:

```bash
mvn clean install
```

This command will:

* Download project dependencies
* Compile the source code
* Run tests
* Package the application into a JAR file

---

### 3. Run the Application

Start the Spring Boot application with Maven:

```bash
mvn spring-boot:run
```

Alternatively, run the packaged JAR file:

```bash
java -jar target/school-management-system.jar
```

---

## Access the Application

Once the application starts, it will be available at:

```
http://localhost:8080
```

Example API endpoint:

```
http://localhost:8080/api/students
```

---

## API Endpoints

### Students

GET /students – Get all students
POST /students – Create a student
GET /students/{id} – Get student by ID
PUT /students/{id} – Update student
DELETE /students/{id} – Delete student

### Teachers

GET /teachers
POST /teachers

### Courses

GET /courses
POST /courses

---

## Future Improvements

* Authentication and authorization (JWT)
* Role-based access control (Admin / Teacher / Student)
* Integration with frontend applications
* Docker containerization
* CI/CD pipeline for automated deployment

---

## Learning Goals

This project helped me practice:

* Building REST APIs with Spring Boot
* Designing layered backend architecture
* Working with relational databases
* Writing clean and maintainable Java code

---

## Author

Geoffrey Nguyai Murira
Software Developer | Android & Backend Developer
