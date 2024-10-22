Rule Engine Application

Overview
This project is built using Java, Maven, Spring Boot, and Thymeleaf. It helps determine users eligibility based on attributes like age, department, income, and spending. The app uses an Abstract Syntax Tree (AST) to manage and evaluate rules dynamically.

Features
User Eligibility: Checks if users meet specific criteria.
Dynamic Rule Management: Easily create, modify, and combine rules.
User-Friendly Interface: Built with Thymeleaf for easy navigation.
RESTful API: Provides endpoints for managing rules and evaluating users.
Data Storage: Uses a backend to store rules and user info.

Architecture
The application is organized into three layers:
UI Layer: The front-end built with Thymeleaf for user interaction.
API Layer: A RESTful API that handles requests for rules and user evaluations.
Backend Layer: The logic for evaluating rules and managing data.

Abstract Syntax Tree (AST)
The AST helps represent rules in a flexible way, allowing for:
Easy rule definitions and evaluations.
On-the-fly modifications and combinations of rules.