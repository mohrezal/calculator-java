# Calculator Project

## Introduction
This project is a simple calculator application that performs basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Setup
Before running the project, ensure you have an H2 database set up on your machine and configured correctly. Follow these steps:

1. **Set up H2 Database**: Install H2 on your machine.
2. **Create Database Tables**: Run the following SQL code in your H2 database to create the necessary tables:

```sql
DROP TABLE IF EXISTS subtraction;
DROP TABLE IF EXISTS multiplication;
DROP TABLE IF EXISTS division;
DROP TABLE IF EXISTS addition;

CREATE TABLE subtraction (
  id UUID PRIMARY KEY,
  statement VARCHAR(255)
);

CREATE TABLE multiplication (
  id UUID PRIMARY KEY,
  statement VARCHAR(255)
);

CREATE TABLE division (
  id UUID PRIMARY KEY,
  statement VARCHAR(255)
);

CREATE TABLE addition (
  id UUID PRIMARY KEY,
  statement VARCHAR(255)
);
```

3. **Modify .env File**: Update the `.env` file with your H2 database configuration:

```properties
JDBC_URL=jdbc:h2:~/calculator <!-- Note: This path format works for macOS. For other operating systems, please verify the appropriate path format. -->
JDBC_USERNAME=your_username
JDBC_PASSWORD=your_password
```

## Usage
Once the setup is complete, you can run the project. Here's how to use it:

1. **Instantiate Calculator Class**: Create an instance of the `Calculator` class in your Java code:

```java
Calculator calculator = new Calculator();
```

2. **Perform Operations**: You can perform the following operations by calling the respective methods:

- Addition: `calculator.addition(number1, number2)`
- Subtraction: `calculator.subtraction(number1, number2)`
- Multiplication: `calculator.multiplication(number1, number2)`
- Division: `calculator.division(number1, number2)`

Replace `number1` and `number2` with the operands you want to operate on.

## Example
Here's an example of how to use the calculator:

```java
Calculator calculator = new Calculator();
Number result = calculator.addition(10, 5);
System.out.println("Result of addition: " + result);

// View history
calculator.history();