# 🧑‍💻 Task S1.02. Exceptions  
**Author:** David Rey  
**Corrected by:** adolcc  

### 📄 Description  
This project contains three exercises distributed across difficulty levels, focused on exception handling, input validation via keyboard, and seat reservation management in a cinema.

### 🔹 Level 1 – Sales Management and Exceptions  
- The `Product` class is created with attributes `name` and `price`.  
- The `Sale` class contains a collection of products and a `totalPrice` attribute.  
- The method `calculateTotal()` throws a custom exception `EmptySaleException` if there are no products.  
- Displays the message: “To make a sale, you must first add products.”  
- Also demonstrates the generation and handling of an `IndexOutOfBoundsException`.

### 🔹 Level 2 – Input Validation with Scanner  
- The `Input` class is created with static methods to read data from the keyboard.  
- Exceptions such as `InputMismatchException` and a custom exception are handled.  
- The methods include:  
  - `readByte(String message)`  
  - `readInt(String message)`  
  - `readFloat(String message)`  
  - `readDouble(String message)`  
  - `readChar(String message)`  
  - `readString(String message)`  
  - `readYesNo(String message)` → returns `true` if the user enters “y”, `false` if “n”.

### 🔹 Level 3 – Cinema Seat Reservation  
- An application is developed to manage seat reservations in a cinema hall.  
- The user inputs the number of rows and seats per row.  
- Functional menu:  
  1. Show all reserved seats  
  2. Show seats reserved by a person  
  3. Reserve a seat  
  4. Cancel a seat reservation  
  5. Cancel all reservations for a person  
  0. Exit  

### 💻 Technologies Used  
- **Java SE 24**  
- **IntelliJ IDEA** as the development environment  
- **Git & GitHub** for version control  
- **JDK** for compiling and running the code  
- **Collections Framework** (ArrayList, etc.)  
- **OOP Principles**:  
  - Class design and encapsulation  
  - Inheritance and polymorphism  
  - Interfaces and abstract methods  
  - Static and final modifiers  
  - Custom exceptions and exception handling  
  - Input validation and user interaction  

### 📋 Requirements  
- **Java Development Kit (JDK) 24 or higher**  
- **IntelliJ IDEA** or any Java-compatible IDE  
- **Git** installed to clone the repository  
- Basic knowledge of object-oriented programming  

### 🛠️ Installation  
1. Clone the repository:  
   ```bash
   git clone https://github.com/Viid21/S1_O2_Exceptions.git
