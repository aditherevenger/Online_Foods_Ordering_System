Online Food Ordering System - Backend

Overview

The Online Food Ordering System is a backend service designed to facilitate seamless food ordering, restaurant management, and payment processing. It is built using Spring Boot and follows a microservices architecture for scalability and maintainability.

Features

User Authentication (JWT-based authentication & authorization)

Role-based Access Control (Customer, Admin, Restaurant Owner)

Restaurant & Menu Management

Order Placement & Tracking

Payment Integration (Stripe/Razorpay)

Review & Ratings System

Cart Management

Email Notifications

Tech Stack

Backend: Java, Spring Boot, Spring Security, JPA/Hibernate

Database: MySQL

Caching: Redis/Memcached

Payment Gateway: Stripe/Razorpay

Messaging Queue: Apache Kafka (if applicable)

Containerization: Docker

API Documentation: Swagger/OpenAPI

Version Control: Git

Installation

Prerequisites

Java 17+

MySQL

Maven

Docker (Optional for containerized deployment)

Steps to Run Locally

Clone the repository:

git clone https://github.com/aditherevenger/online-food-ordering-backend.git
cd online-food-ordering-backend

Configure the application.properties file with your MySQL database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/food_ordering_db
spring.datasource.username=root
spring.datasource.password=your_password

Run the application using Maven:

mvn spring-boot:run

Access the API documentation via Swagger UI:

http://localhost:8080/swagger-ui.html

API Endpoints

Endpoint

Method

Description

/api/auth/register

POST

Register a new user

/api/auth/login

POST

Login and obtain JWT

/api/restaurants

GET

Get list of restaurants

/api/orders

POST

Place an order

/api/payments

POST

Process payment

Future Enhancements

Implement GraphQL for better query efficiency

Add real-time order tracking using WebSockets

AI-based personalized recommendations

Contribution Guidelines

Fork the repository.

Create a new branch (feature-xyz or bugfix-xyz).

Commit your changes.

Push to your branch and create a Pull Request.

License

This project is licensed under the MIT License.

Author

Aditya Yadav

GitHub: @aditherevenger

Email: adiric121@gmail.com
