# Warehouse-management

Simple warehouse management system

# System abilities
* Display of the stock level (table `products`)
* Adding a new product to the warehouse
* Display of products for the order (table `orders`)
* Adding products to the order list.


# Database - MySql
All configuration with database are in the `application.properties` file.
Database connection:
```
spring.datasource.url = jdbc:mysql://localhost:3306/managment
spring.datasource.username=
spring.datasource.password=
```
Application works on  `managment schema`
 
# Automatic completion of tables
At startup, the application uses the file `data.sql` to fill in the two tables` orders` and `products`

# Setup

Clone this repo to your desktop. Run applications using Spring Boot. You will then be able to access it at `localhost:8080`.

# Login

Default login details - login: `kowalski`, password:` springboot`.
Login and password are set in the file `SpringConfig`.
To change the data, enter the new data here:

```
.withUser("kowalski")
.password(encoder.encode("springboot"))
```

# Project is created with
* Java 8
* Spring Boot
* Spring Security
* Spring Data JPA
* Spring Web
* Thymeleaf
* Maven
* MySql
* Bootstrap
* Lombok

