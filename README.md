# Right-Angled Triangle Number Pattern Program

## Overview
This Java program prints a right-angled triangle pattern with numbers arranged in an incremental sequence. The user inputs a number (`n`), which determines the number of rows in the pattern. Each row contains an increasing count of numbers, starting from 1.

## Code Explanation

### 1. **Package Declaration**
```java
package number_patterns;
```
This line declares that the class belongs to the `number_patterns` package. A package is used to group related classes together.

### 2. **Importing the Scanner Class**
```java
import java.util.Scanner;
```
The `Scanner` class is part of the `java.util` package and is used to take user input from the console.

### 3. **Class Definition**
```java
public class Right_Angled_Triangle
```
This defines the `Right_Angled_Triangle` class, which contains the `main` method where the program execution starts.

### 4. **Main Method**
```java
public static void main(String[] args)
```
The `main` method serves as the entry point for the program.

### 5. **Creating Scanner Object for User Input**
```java
Scanner s = new Scanner(System.in);
```
- A `Scanner` object named `s` is created to read input from the standard input stream (keyboard).
- `System.in` represents input from the keyboard.

### 6. **Prompting User Input**
```java
System.out.println("Enter the size");
```
This statement prints a message to the console asking the user to enter the size (`n`) of the triangle.

### 7. **Reading User Input**
```java
int n = s.nextInt();
```
- `s.nextInt()` reads an integer value from the user and stores it in the variable `n`.
- The integer `n` represents the number of rows in the triangle.

### 8. **Initializing Number Counter**
```java
int num = 1;
```
- `num` is initialized to `1` and is used to print numbers sequentially.

### 9. **Outer Loop (Rows Control)**
```java
for(int i=1;i<=n;i++)
```
- This loop controls the number of rows in the triangle.
- It starts from `i = 1` and runs until `i <= n`.
- `i` represents the current row number.

### 10. **Inner Loop (Column Control)**
```java
for(int j=1;j<=i;j++)
```
- This loop controls the number of elements printed in each row.
- It runs from `j = 1` to `j <= i`, ensuring that each row has `i` numbers.

### 11. **Printing Numbers**
```java
System.out.print(num++ +" ");
```
- `System.out.print()` is used to print the current value of `num` followed by a space.
- `num++` prints the current value and then increments `num` by 1.

### 12. **Moving to the Next Line**
```java
System.out.println();
```
This moves the cursor to the next line after each row is printed.

### 13. **Closing the Scanner Object** *(Best Practice)*
```java
s.close();
```
Although not included in the given code, it is recommended to close the `Scanner` object after use to free up resources.

## Example Output
### **User Input:**
```
Enter the size
5
```

### **Program Output:**
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

## Key Concepts Used
### 1. **Scanner Class**
- Used for user input handling.
- `nextInt()` method reads an integer from the user.

### 2. **Variables**
- `n`: Stores user input (number of rows).
- `num`: Stores and increments the printed numbers.

### 3. **Loops**
- **Outer loop (`for`)** controls the number of rows.
- **Inner loop (`for`)** controls the number of elements in each row.

### 4. **Printing Statements**
- `System.out.print()` prints numbers in the same line.
- `System.out.println()` moves to the next line after each row.

## Conclusion
This program efficiently prints a right-angled number pattern using nested loops and the `Scanner` class for user input. It demonstrates the use of loops, variables, and printing techniques in Java.

## Clone
```
git init https://github.com/Ananthadatta02/Java-Right_Angled_Triangle.git
```
