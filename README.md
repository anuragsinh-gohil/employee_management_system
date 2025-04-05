# Employee Data Management System

## Project Overview

The **Employee Data Management System** is a **full-stack web application** designed to manage employee data with CRUD (Create, Read, Update, Delete) functionality. The system is built using **Spring Boot** for the backend and **Angular** for the frontend. It enables users to interact with employee records seamlessly, supporting operations like adding, viewing, updating, and deleting employees. The backend is connected to a **MySQL** database, and the frontend is built to be intuitive and responsive.

---

## Technologies Used

### Backend:

- **Java**: Primary programming language used for backend development.
- **Spring Boot**: Framework for developing RESTful APIs, handling business logic, and managing dependencies.
- **Spring Data JPA**: Used for simplifying the data access layer, interacting with the MySQL database.
- **MySQL**: Relational database for storing employee data.
- **RESTful API**: Backend exposes HTTP-based API endpoints to perform CRUD operations.
- **Maven**: Dependency management and build automation tool for the backend.

### Frontend:

- **Angular**: Framework for building the frontend of the application. It allows the creation of dynamic, single-page applications.
- **TypeScript**: Superset of JavaScript, enabling strong typing and other features for Angular development.
- **HTML, CSS, SCSS**: Core technologies for structuring and styling the application.
- **Angular Material**: Component library to provide modern UI elements like buttons, tables, and forms.
- **Reactive Programming (RxJS)**: Utilized for managing asynchronous data streams and handling HTTP requests.

### Tools & Technologies:

- **Postman**: API testing tool used for verifying the backend endpoints.
- **Git**: Version control system used to manage the codebase and collaborate.
- **Visual Studio Code**: Primary IDE used for both frontend and backend development.
- **Docker** (optional): For containerization of the backend and frontend applications (for deployment).

---

## Features

- **Create Employee**: Users can add new employee records to the system by filling out a form.
- **View Employees**: A list of all employees is displayed in a table with sorting and pagination features.
- **Update Employee**: Users can edit existing employee records.
- **Delete Employee**: Employees can be deleted from the system.
- **Search Employees**: Search and filter employees by name, department, or other criteria.
- **Responsive Design**: The application is responsive, providing a good experience across devices (desktop, tablet, mobile).

---

## Project Setup

### Prerequisites

Before starting, ensure you have the following installed:

- **Java 8+**: For building the backend with Spring Boot.
- **MySQL**: For the database that stores employee data.
- **Node.js**: For managing frontend dependencies.
- **Angular CLI**: To run and build the Angular frontend.

### Backend Setup

1. Clone the repository:

    ```bash
    git clone <repository-url>
    cd backend
    ```

2. Set up **MySQL Database**:

    - Create a MySQL database named `employee_db`.
    - Update your `src/main/resources/application.properties` with the following configuration:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
    spring.datasource.username=<your-username>
    spring.datasource.password=<your-password>
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```

3. Install backend dependencies (via Maven):

    ```bash
    mvn clean install
    ```

4. Run the Spring Boot application:

    ```bash
    mvn spring-boot:run
    ```

    Your backend should now be running at `http://localhost:8080`.

### Frontend Setup

1. Navigate to the **frontend** directory:

    ```bash
    cd frontend
    ```

2. Install frontend dependencies:

    ```bash
    npm install
    ```

3. Update the API URL in the **employee service** to connect the frontend to the backend:

    - Open `src/app/services/employee.service.ts` and set the `baseUrl`:

    ```typescript
    private baseUrl = 'http://localhost:8080/api/employees';
    ```

4. Run the Angular development server:

    ```bash
    ng serve
    ```

    The frontend should now be accessible at `http://localhost:4200`.

---

## Folder Structure

