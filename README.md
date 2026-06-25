# 💰 Expense Tracker API

![Java](https://img.shields.io/badge/Java-25-orange.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.0-brightgreen.svg)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Ready-blue.svg)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

A robust, RESTful API for managing personal expenses. Built with **Spring Boot** and **PostgreSQL**, this backend service provides a clean, layered architecture (Controller → Service → Repository) to track, categorize, and manage your daily expenses efficiently.

---

## 🚀 Features

- **Full CRUD Operations:** Create, Read, Update, and Delete expenses.
- **Category Filtering:** Easily retrieve all expenses under a specific category.
- **Smart Defaults:** Automatically sets the current date for an expense if no date is provided.
- **Database Initialization:** Automatically seeds the database with sample data (groceries, rent) on startup if empty.
- **Reliable Data Persistence:** Auto-generated IDs using PostgreSQL sequences.
- **Robust Error Handling:** Clear, informative error messages for invalid requests and non-existent resources.
- **Clean Architecture:** Strictly follows the Controller-Service-Repository pattern.

---

## 🛠️ Tech Stack

- **Java 25**
- **Spring Boot 4.1.0** (Web, Data JPA)
- **PostgreSQL** (Database)
- **Hibernate** (ORM)
- **Maven** (Dependency Management)

---

## 📋 API Endpoints

Base URL: `http://localhost:8080/api/v1/expense`

| Method  |       Endpoint         |              Description               |
|---------|------------------------|----------------------------------------|
| `GET`   |          `/`           |          Retrieve all expenses         |
| `GET`   | `/category/{category}` | Retrieve expenses filtered by category |
| `POST`  |          `/`           |          Create a new expense          |
| `PUT`   |          `/{id}`       |        Update an existing expense      |
| `DELETE`|         `/{id}`        |         Delete an expense by ID        |

---

## 🧪 Testing with Postman

1. Open Postman.
2. Use the endpoints listed above.
3. Example `POST` request:
   - **URL:** `http://localhost:8080/api/v1/expense`
   - **Headers:** `Content-Type: application/json`
   - **Body (JSON):**
     ```json
     {
         "description": "Weekly groceries",
         "amount": 150.50,
         "date": "2026-06-25",
         "category": "Food"
     }
     ```
4. Send a `GET` request to `/` to verify the expense was added.

---

## 💻 Getting Started

### Prerequisites
- **Java 25** or higher installed.
- **Maven** installed.
- **PostgreSQL** installed and running.

### Database Setup
1. Open PostgreSQL and create a new database named `expense`:
   ```sql
   CREATE DATABASE expense;
   ```

### Configure the Application
1. Rename `src/main/resources/application-example.properties` to `application.properties`.
2. Update the password field with your PostgreSQL password:
   ```properties
   spring.datasource.password=your_password_here
   ```

### Run the Application
```bash
mvn spring-boot:run
```

The API will be available at `http://localhost:8080/api/v1/expense`.

---

## 🚀 Deploying as a JAR

You can also package the application as a JAR:

```bash
mvn clean package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

---

## 📸 Screenshots

*(Add Postman screenshots here!)*
<img width="936" height="317" alt="postman" src="https://github.com/user-attachments/assets/8e6b7726-f5f4-41a2-b613-22753d5d502a" />
<img width="1366" height="726" alt="postman1" src="https://github.com/user-attachments/assets/85e38c9e-2a98-48b1-a0f5-c8ee103d324d" />
<img width="1366" height="726" alt="postman1 3" src="https://github.com/user-attachments/assets/0d496ec0-0e64-458c-8388-cdc8813832b7" />
<img width="1366" height="725" alt="postman1 9" src="https://github.com/user-attachments/assets/f09b8c05-4b1d-407b-89a9-ff17315c2d5f" />
<img width="1366" height="730" alt="postman1 12" src="https://github.com/user-attachments/assets/84c5b7da-e781-4e94-979e-a034c0e7422d" />


Example:
- `GET /api/v1/expense` response showing all expenses
- `POST /api/v1/expense` request with JSON body and response

---

## 🔮 Future Improvements

- [ ] Add user authentication with JWT
- [ ] Deploy on cloud platform (AWS/Heroku)
- [ ] Add expense reports and analytics
- [ ] Build a React frontend

---

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## 📬 Contact

- **Muhammad Anas Kamran**
- [LinkedIn](https://www.linkedin.com/in/muhammad-anas-kamran-00558034b/)
- [GitHub](https://github.com/MAnasKamran)
