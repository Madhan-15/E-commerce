E-commerce Cart System
=======================

Overview
--------
This is a simple console-based E-commerce cart system that allows users to view products, add products to a cart, update quantities, remove items, and view the total bill. The project demonstrates the use of design patterns (Strategy and Prototype), SOLID principles, and OOP concepts.

Functional Requirements
-----------------------
1. Display a list of products with their attributes.
2. Allow users to add products to the cart.
3. Implement cart functionality where users can view, update quantities, and remove items.
4. Calculate and display the total bill.

Design Patterns
---------------
1. **Strategy Pattern**: Used to handle different discount strategies (e.g., percentage off, buy one get one free).
2. **Prototype Pattern**: Used to clone product objects when adding to the cart.

Setup Instructions
------------------
1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Download the project files and unzip them to your desired directory.

Project Structure
-----------------

How to Compile
--------------
1. Open a terminal/command prompt.
2. Navigate to the project directory.

```sh
cd /path/to/ECommerceCartSystem
3.Compile the Java source files.
javac -d bin -sourcepath src src/com/ecommerce/models/*.java src/com/ecommerce/cart/*.java src/com/ecommerce/strategies/*.java src/com/ecommerce/ECommerceApp.java
How to Run
4.After compiling, run the main application.
java -cp bin com.ecommerce.ECommerceApp