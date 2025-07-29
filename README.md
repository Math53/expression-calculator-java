# Expression Calculator in Java

This project parses and evaluates infix math expressions using the **Shunting Yard Algorithm** and **Postfix Evaluation**.

## Features
- Converts infix to postfix
- Evaluates postfix expressions
- Handles basic operations: +, -, *, /

##  Project Structure
src/
├── Calculator.java
├── InfixToPostfixConverter.java
└── PostfixEvaluator.java

test/
└── CalculatorTest.java

##  How to Run

Compile all files:
```bash
javac src/*.java test/*.java

Run from main class:
java src.Calculator

Or run the test:
java test.CalculatorTest

Example Input
3 + 4 * (2 - 1)

Output:
Infix: 3 + 4 * (2 - 1)
Postfix: 3 4 2 1 - * +
Result: 7.0

Author: Amrita Pathak | GitHub: Math53
