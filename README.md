# 🛍️ Store Application

A minimal **Spring Boot** application serving as the foundation for an online store, product catalog, or inventory management system. It includes embedded Tomcat, a static welcome page, and is ready for building REST APIs or integrating with a frontend and database.

---

## 📦 Features

- ✅ Java 24 and Spring Boot 3.5.4
- ✅ Maven-based build system
- ✅ Embedded Tomcat server (port `8080`)
- ✅ Static `index.html` served from `resources/static/`
- 🚧 Ready for adding REST endpoints
- 🚧 Easily extendable with database integration (JPA, MongoDB, etc.)

---

## 🚀 Getting Started

### Prerequisites
- Java 21+ (Java 24 recommended)
- Maven 3.9+
- IntelliJ IDEA / VS Code / Terminal

### Run Locally

 **Clone the repository**
   ```bash
   git clone https://github.com/your-username/store.git
   cd store
Build the project

**Build the project**
bash
Copy
Edit

**Start the server**
bash
Copy
Edit
mvn clean install
Start the server

bash
Copy
Edit
mvn spring-boot:run

🗂️ Project Structure
bash
Copy
Edit
store/
├── src/
│   └── main/
│       ├── java/com/example/store/
│       │   └── StoreApplication.java    # Main Spring Boot entry point
│       └── resources/
│           └── static/index.html        # Static homepage
├── pom.xml                              # Maven dependencies
