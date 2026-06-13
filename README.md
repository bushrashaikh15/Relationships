# Relationships - Spring Boot JPA Relationships

A complete Spring Boot project demonstrating JPA (Java Persistence API) relationships including One-to-One, One-to-Many, and Many-to-Many mappings.

## JPA Relationships Demonstrated

- **One-to-One (@OneToOne)** - Person ↔ Passport
- **One-to-Many (@OneToMany)** - Author ↔ Books
- **Many-to-One (@ManyToOne)** - Books ↔ Author
- **One-to-Many (@OneToMany)** - User ↔ Orders

## Technology Stack

- **Java 17** - Programming language
- **Spring Boot** - Application framework
- **Spring Data JPA** - Database operations
- **MySQL** - Database
- **Maven** - Dependency management

## How to Run

1. Configure database in `src/main/resources/application.properties`
2. Run `RelationshipsApplication.java`
3. Access the application at `http://localhost:8080`

## JPA Relationships Explained

| Relationship | Example | JPA Annotation |
|--------------|---------|----------------|
| One-to-One | Person ↔ Passport | @OneToOne |
| One-to-Many | Author ↔ Book | @OneToMany / @ManyToOne |
| One-to-Many | User ↔ Order | @OneToMany / @ManyToOne |

## Project Structure
Relationships/
├── src/main/java/com/example/demo/models/
│ ├── Author.java # One-to-Many with Book
│ ├── Book.java # Many-to-One with Author
│ ├── Person.java # One-to-One with Passport
│ ├── Passport.java # One-to-One with Person
│ ├── User.java # One-to-Many with Order
│ └── Order.java # Many-to-One with User
└── pom.xml
