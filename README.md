# 🎓 Learning Management System (LMS)

A full-featured **Spring Boot** backend application for managing students, courses, and instructors in a learning environment.  
This project demonstrates a clean, production-style architecture using **Spring Boot**, **JPA/Hibernate**, and **MySQL** (or MongoDB), with proper use of **DTOs**, **Exception Handling**, and **Layered Design Patterns**.

---

## 🧩 Tech Stack

**Backend:** Java 17+, Spring Boot, Spring Data JPA, Hibernate  
**Database:** MySQL *(can be switched to MongoDB)*  
**Build Tool:** Maven  
**Tools:** Postman, Git, IntelliJ IDEA / VS Code

---

✅ **Follows SOLID principles**  
✅ **Layered structure** (Controller → Service → Repository → Model)  
✅ **Separation of concerns** for scalability and clarity  

---

## 🚀 Features

### 👨‍🎓 Student Management
- Create, update, view, and delete students  
- List all courses a student is enrolled in  

### 📘 Course Management
- Add, update, or remove courses  
- Retrieve all students in a course  
- Assign an instructor to a course  

### 👩‍🏫 Instructor Management
- Manage instructor data and course assignments  

### 🔗 Relationships
- **One-to-Many:** Instructor → Course  
- **Many-to-Many:** Student ↔ Course  
- **One-to-One:** (Optional, for Profile or Department entities)

---

### 💡 Future Enhancements

- Add JWT-based authentication & role management (Admin/Instructor/Student)
- Add pagination & filtering for large datasets
- Integrate with React frontend (fullstack LMS)
- Add Swagger/OpenAPI documentation

## ⚙️ Setup & Run

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/Sha050/learningManagementSystem.git
cd learningManagementSystem

