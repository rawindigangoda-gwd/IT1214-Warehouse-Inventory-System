# IT1214 - Warehouse Inventory Management System

A simple, console-based Java application designed to manage warehouse stock levels using the Java Collections Framework.

## Project Description
This system allows a user to perform CRUD (Create, Read, Update, Delete) operations on warehouse items. It utilizes a `HashMap` to store items, ensuring fast lookups by Item ID. The project demonstrates core Object-Oriented Programming (OOP) principles such as encapsulation, abstraction, and modular design.

## Features
* **Add Items:** Insert new products with unique IDs.
* **Remove Items:** Delete products from the inventory using their ID.
* **Update Stock:** Modify the quantity of existing items.
* **Search:** Find items quickly by ID or Name.
* **View All:** Display a formatted list of all current inventory.

## How to Run the Program
1. **Prerequisites:** Ensure you have the Java Development Kit (JDK) installed on your machine.
2. **Download:** Clone this repository or download the `.java` files.
3. **Compile:** Open your terminal or command prompt and navigate to the folder. Run:
   ```bash
   javac *.java
   java Warehouse
   --- Warehouse Inventory System ---
1. Add Item
2. Remove Item
3. Update Stock
4. Search Item
5. View All
6. Exit
Choice: 1

Enter ID: W-101
Enter Name: Mechanical Keyboard
Enter Qty: 25
Enter Price: 89.99
Item added successfully.

Choice: 5
ID: W-101 | Name: Mechanical Keyboard | Qty: 25 | Price: $89.99
