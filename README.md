# DAO JDBC - Data Access Object Pattern Implementation

A clean, production-focused implementation of the **Data Access Object (DAO) pattern** using Java and JDBC. This project demonstrates best practices in database abstraction, separation of concerns, and enterprise application architecture.

## 🎯 Project Overview

This project showcases a complete DAO layer for a sales management system with Sellers and Departments. It emphasizes:

- **Design Patterns**: DAO pattern for database abstraction and Factory pattern for object creation
- **JDBC Best Practices**: Connection pooling, prepared statements, and exception handling
- **Clean Architecture**: Clear separation between business logic and data access layers
- **Type Safety**: Strong typing with domain entities and exception handling
- **CRUD Operations**: Full Create, Read, Update, Delete functionality with database integration

## 🛠️ Technology Stack

- **Language**: Java (17+)
- **Database Access**: JDBC
- **Design Patterns**: DAO, Factory
- **Database Support**: MySQL
- **Build System**: IntelliJ IDEA

## 📋 Features

### Core Functionality
- ✅ **Complete CRUD Operations** - Create, read, update, and delete records
- ✅ **Entity Management** - Seller and Department entities with relationships
- ✅ **Database Connection Management** - Centralized connection handling with db.properties
- ✅ **Custom Exception Handling** - Specialized exceptions for database operations and integrity constraints
- ✅ **Query Flexibility** - Find by ID, find all, find by relationships
- ✅ **Transaction Support** - Proper resource management with try-with-resources

### Design Patterns Implemented
- **DAO Pattern**: Abstracts database operations behind clean interfaces
- **Factory Pattern**: DaoFactory for decoupled object creation
- **Repository Pattern**: Standardized data access contracts

## 📁 Project Structure

```
src/
├── Main.java                          # Application entry point
├── db/
│   ├── DB.java                       # Database connection utility
│   ├── DbException.java              # Custom database exception
│   └── DbIntegrityException.java     # Integrity constraint exception
└── model/
    ├── dao/
    │   ├── DaoFactory.java           # Factory for creating DAOs
    │   ├── DepartmentDao.java        # Department DAO interface
    │   ├── SellerDao.java            # Seller DAO interface
    │   └── impl/
    │       ├── DepartmentDaoJDBC.java # Department DAO JDBC implementation
    │       └── SellerDaoJDBC.java     # Seller DAO JDBC implementation
    └── entities/
        ├── Department.java            # Department entity
        └── Seller.java                # Seller entity
```

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- MySQL database
- Maven or Gradle (optional)

### Configuration
1. Update `db.properties` with your database credentials:
```properties
user=your_db_user
password=your_db_password
dburl=jdbc:mysql://localhost:3306/your_database
```

2. Create the database schema with Seller and Department tables

### Running the Application
```bash
java Main
```

## 💡 Usage Examples

### Finding a Seller by ID
```java
SellerDao sellerDao = DaoFactory.createSellerDao();
Seller seller = sellerDao.findById(7);
```

### Inserting a New Seller
```java
Seller newSeller = new Seller(null, "John Doe", "john@email.com", 
                              LocalDate.of(1990, 5, 15), 5000.0, department);
sellerDao.insert(newSeller);
```

### Updating a Seller
```java
seller.setName("Jane Doe");
sellerDao.update(seller);
```

### Finding All Sellers in a Department
```java
List<Seller> sellers = sellerDao.findByDepartment(department);
```

## 🎓 Learning Outcomes

This project demonstrates:
- ✨ Proper abstraction and encapsulation principles
- ✨ Database independence through DAO abstraction
- ✨ Exception handling for data access operations
- ✨ Clean code practices and SOLID principles
- ✨ Object-relational mapping concepts
- ✨ Resource management and connection pooling

## 📌 Key Concepts

**DAO Pattern Benefits**:
- Decouples business logic from database implementation
- Makes code testable and maintainable
- Allows easy database migration (e.g., switching from JDBC to JPA)
- Centralizes database queries and logic

**Factory Pattern Benefits**:
- Provides a single point for DAO object creation
- Makes it easy to switch implementations
- Improves code flexibility and maintainability

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

---

**Built to demonstrate**: Enterprise Java development practices, design patterns, and clean architecture principles.