# Resume Builder Backend
A robust and scalable Spring Boot REST API that serves as the backend for a Resume Builder application. It manages user authentication, profile serialization, and various resume sections including personal details, education, work experience, skills, and custom/additional sections.
---
## 🚀 Key Features
- **User Authentication**: Secure user registration and login verification.
- **Resume Section Management**: Complete CRUD operations for:
  - Personal Details
  - Professional Profiles
  - Work Experience
  - Education History
  - Skills & Proficiency Levels
  - Custom Additional Sections
- **CORS Configured**: Pre-configured for seamless integration with an Angular frontend (`http://localhost:4200`).
- **JPA & Hibernate ORM**: Automatically handles database schema updates and queries.
---
## 🛠️ Technology Stack
- **Java Version**: 17
- **Framework**: Spring Boot 3.0.5
- **ORM / Database Access**: Spring Data JPA & Hibernate
- **Database**: MySQL
- **Developer Tools**: Lombok & Spring Boot DevTools
- **Build Tool**: Maven
---
## 📋 Database Configuration
The application is configured to connect to a MySQL instance. To change these configurations, edit the [application.properties](file:///Users/shakthipriya/Downloads/backend-resume/src/main/resources/application.properties) file.
Default settings:
```properties
server.port = 8081
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/invoice?useSSL=false
spring.datasource.username=hbstudent
spring.datasource.password=hbstudent
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql = true
server.error.include-message=always
```
> [!NOTE]  
> Make sure to create a database named `invoice` (or modify `spring.datasource.url` to match your database name) in MySQL before starting the application.
---
## 🔌 API Endpoints Documentation
All endpoints are prefixed with `/api/v1` and support Cross-Origin Resource Sharing (CORS) with `http://localhost:4200`.
### 1. User Registration & Login
Manages authentication for resume creators.
*   **Register User**
    *   **Method**: `POST`
    *   **Endpoint**: `/api/v1/customer/add`
    *   **Request Body**:
        ```json
        {
          "name": "Jane Doe",
          "email": "jane.doe@example.com",
          "password": "securepassword123"
        }
        ```
*   **User Login**
    *   **Method**: `GET`
    *   **Endpoint**: `/api/v1/customer/{email}/{password}`
    *   **Example**: `/api/v1/customer/jane.doe@example.com/securepassword123`
---
### 2. Personal Details
Manages basic contact and profile heading details.
*   **Save/Update Personal Details**
    *   **Method**: `POST`
    *   **Endpoint**: `/api/v1/personalDetails/add`
    *   **Request Body**:
        ```json
        {
          "id": 1,
          "firstName": "Jane",
          "lastName": "Doe",
          "email": "jane.doe@example.com",
          "jobTitle": "Senior Software Engineer",
          "phoneNumber": "+1234567890"
        }
        ```
*   **Get Personal Details**
    *   **Method**: `GET`
    *   **Endpoint**: `/api/v1/personalDetails/{id}`
---
### 3. Profile
Stores general biography or raw resume configuration structures.
*   **Save/Update Profile**
    *   **Method**: `POST` / `GET` (Mapping: `/add`)
    *   **Endpoint**: `/api/v1/profile/add`
    *   **Request Body**:
        ```json
        {
          "id": 1,
          "profile": "Passionate Software Engineer with 5+ years of experience building scalable applications..."
        }
        ```
*   **Get Profile**
    *   **Method**: `GET`
    *   **Endpoint**: `/api/v1/profile/{id}`
---
### 4. Work Details
Manages professional employment history.
*   **Save/Update Work History**
    *   **Method**: `POST`
    *   **Endpoint**: `/api/v1/workDetails/add`
    *   **Request Body**:
        ```json
        [
          {
            "studentId": 1,
            "role": "Software Engineer II",
            "place": "Google",
            "city": "Mountain View",
            "state": "CA",
            "startDate": "2024-01-15T00:00:00.000+00:00",
            "endDate": null,
            "description": "Developed high-performance microservices and optimized database queries."
          }
        ]
        ```
*   **Get Work Details**
    *   **Method**: `GET`
    *   **Endpoint**: `/api/v1/workDetails/{studentId}`
*   **Delete Work Experience Entry**
    *   **Method**: `DELETE`
    *   **Endpoint**: `/api/v1/workDetails/delete/{id}`
---
### 5. Educational Details
Manages academic qualifications.
*   **Save/Update Education**
    *   **Method**: `POST`
    *   **Endpoint**: `/api/v1/educationalDetails/add`
    *   **Request Body**:
        ```json
        [
          {
            "studentId": 1,
            "school": "Stanford University",
            "degree": "B.S. in Computer Science",
            "city": "Stanford",
            "state": "CA",
            "startDate": "2018-09-01T00:00:00.000+00:00",
            "endDate": "2022-06-15T00:00:00.000+00:00",
            "description": "Graduated with Honors. Specialized in Software Systems."
          }
        ]
        ```
*   **Get Education Details**
    *   **Method**: `GET`
    *   **Endpoint**: `/api/v1/educationalDetails/{studentId}`
*   **Delete Education Entry**
    *   **Method**: `DELETE`
    *   **Endpoint**: `/api/v1/educationalDetails/delete/{id}`
---
### 6. Skills Details
Manages professional skills and proficiency levels.
*   **Save/Update Skills**
    *   **Method**: `POST`
    *   **Endpoint**: `/api/v1/skillsDetails/add`
    *   **Request Body**:
        ```json
        [
          {
            "studentId": 1,
            "skill": "Java / Spring Boot",
            "level": "Expert"
          },
          {
            "studentId": 1,
            "skill": "MySQL",
            "level": "Intermediate"
          }
        ]
        ```
*   **Get Skills Details**
    *   **Method**: `GET`
    *   **Endpoint**: `/api/v1/skillsDetails/{studentId}`
*   **Delete Skill Entry**
    *   **Method**: `DELETE`
    *   **Endpoint**: `/api/v1/skillsDetails/delete/{id}`
---
### 7. Additional Sectional Details
Manages custom headers and sections on the resume (e.g., Languages, Certifications, Interests).
> [!WARNING]  
> Notice the typo in the endpoint mapping path (`additonalSection` without the first 'i'). Be sure to direct requests to the exact URI shown below.
*   **Save/Update Custom Sections**
    *   **Method**: `POST`
    *   **Endpoint**: `/api/v1/additonalSection/add`
    *   **Request Body**:
        ```json
        [
          {
            "studentId": 1,
            "sectionHeader": "Certifications",
            "sectionDescription": "AWS Certified Solutions Architect Associate (2025)"
          }
        ]
        ```
*   **Get Custom Sections**
    *   **Method**: `GET`
    *   **Endpoint**: `/api/v1/additonalSection/{studentId}`
*   **Delete Custom Section Entry**
    *   **Method**: `DELETE`
    *   **Endpoint**: `/api/v1/additonalSection/delete/{id}`
---
## 🏃 Getting Started
### Prerequisites
1.  **JDK 17** installed and configured in your environment variables.
2.  **Maven** installed (or use the provided Maven Wrapper `./mvnw`).
3.  **MySQL Server** running locally or remotely.
### Installation & Run Steps
1.  **Clone the Repository**
    ```bash
    git clone <repository-url>
    cd backend-resume
    ```
2.  **Configure Database**
    Ensure MySQL is running and a database named `invoice` exists. Update credentials in `src/main/resources/application.properties` if necessary:
    ```sql
    CREATE DATABASE invoice;
    ```
3.  **Build and Run**
    Using the Maven Wrapper:
    ```bash
    # On macOS/Linux:
    ./mvnw spring-boot:run
    # On Windows:
    mvnw.cmd spring-boot:run
    ```
    Or, package the application as a JAR and run it:
    ```bash
    ./mvnw clean package
    java -jar target/maker-0.0.1-SNAPSHOT.jar
    ```
4.  The server will start running on **`http://localhost:8081`**.
