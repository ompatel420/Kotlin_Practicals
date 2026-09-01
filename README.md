# Practical 1: Kotlin Programming Concepts

## AIM 
Develop a Kotlin program for demonstrating various programming concepts.

---

## 📌 Overview

This practical demonstrates fundamental **Kotlin programming concepts** through a series of programs covering variables, type conversion, user input, control flow, functions, recursion, arrays, collections, classes, constructors, operator overloading, and matrix operations.

\---

## 🎯 Objectives

The main objectives of this practical are to:

* Understand different Kotlin data types and variables.
* Perform type conversion between different data types.
* Accept and display student information using user input.
* Use conditional statements and `when` expressions.
* Create and use user-defined functions.
* Implement recursion for factorial calculation.
* Work with arrays, loops, sorting, and array-related functions.
* Find the maximum value from an `ArrayList`.
* Understand classes, constructors, properties, and member functions.
* Implement operator overloading in Kotlin.
* Perform matrix addition, subtraction, and multiplication.
* Customize object output using `toString()`.

\---

## 🛠️ Technologies Used

* **Programming Language:** Kotlin
* **Platform:** JVM
* **IDE:** IntelliJ IDEA / Android Studio
* **Concepts:** Variables, Input/Output, Control Flow, Functions, Recursion, Arrays, Collections, OOP, Operator Overloading

\---

# 📚 Practical Contents

## 1.1 Store \& Display Values in Different Variables

This program demonstrates different Kotlin data types and displays their values.

### Data Types Covered

|Data Type|Example|
|-|-|
|Integer|`10`|
|Double|`10.25`|
|Float|`10.25f`|
|Long|`100000L`|
|Short|`100`|
|Byte|`10`|
|Char|`'A'`|
|Boolean|`true`|
|String|`"Kotlin"`|

### Concepts

* Variable declaration using `val` and `var`
* Kotlin primitive data types
* Printing values using `println()`

\---

## 1.2 Type Conversion

This program demonstrates conversion between different data types.

### Conversions Demonstrated

* Integer → Double
* String → Integer
* String → Double

### Important Kotlin Functions

```kotlin
toDouble()
toInt()
toFloat()
toLong()
toShort()
toByte()
```

### Example

```kotlin
val number = 10
val doubleNumber = number.toDouble()

val strInt = "25".toInt()
val strDouble = "12.5".toDouble()
```

\---

## 1.3 Scan Student Information and Display All Data

This program accepts student information from the user and displays the entered data.

### Information Collected

* Student Name
* Enrollment Number
* Branch
* Semester
* Age
* College Name

### Concepts

* `readLine()`
* User input
* String and numeric conversion
* Displaying formatted information

### Example

```kotlin
print("Enter Name: ")
val name = readLine()

print("Enter Enrollment No: ")
val enrollment = readLine()
```

\---

## 1.4 Check Odd or Even Numbers

This program determines whether a number is odd or even.

### Logic

```text
If number % 2 == 0 → Even
Otherwise → Odd
```

### Kotlin Example

```kotlin
val number = 10

println(
    if (number % 2 == 0)
        "Even"
    else
        "Odd"
)
```

### Concept Used

* `%` modulo operator
* `if-else`
* Conditional expression inside `println()`

\---

## 1.5 Display Month Name

This program uses a Kotlin `when` expression to display the month name based on the month number.

### Example

```kotlin
val month = 3

when (month) {
    1 -> println("January")
    2 -> println("February")
    3 -> println("March")
    4 -> println("April")
    5 -> println("May")
    6 -> println("June")
    7 -> println("July")
    8 -> println("August")
    9 -> println("September")
    10 -> println("October")
    11 -> println("November")
    12 -> println("December")
    else -> println("Invalid Month")
}
```

### Concept Used

* `when` expression
* Multiple conditions
* User input validation

\---

## 1.6 User-Defined Function

This program creates a function to perform basic arithmetic operations on two numbers.

### Operations

* Addition
* Subtraction
* Multiplication
* Division

### Example

```kotlin
fun calculate(a: Double, b: Double) {
    println("Addition = ${a + b}")
    println("Subtraction = ${a - b}")
    println("Multiplication = ${a \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* b}")
    println("Division = ${a / b}")
}
```

### Concepts

* Function declaration
* Parameters
* Function calls
* Arithmetic operators

\---

## 1.7 Factorial Calculation with Recursion

This program calculates the factorial of a number using recursion.

### Formula

```text
n! = n × (n-1)!
0! = 1
```

### Example

```kotlin
fun factorial(n: Int): Long {
    return if (n <= 1)
        1
    else
        n \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* factorial(n - 1)
}
```

### Example

```text
5! = 5 × 4 × 3 × 2 × 1
5! = 120
```

### Concept Used

* Recursion
* Base condition
* Recursive function call

\---

## 1.8 Working with Arrays

This section demonstrates different array operations and looping techniques in Kotlin.

### Array Functions Covered

* `Arrays.deepToString()`
* `contentDeepToString()`
* `joinToString()`

### Example

```kotlin
val numbers = intArrayOf(10, 20, 30, 40)

println(numbers.joinToString())
```

### Loop Types Covered

#### Range

```kotlin
for (i in 1..5) {
    println(i)
}
```

#### DownTo

```kotlin
for (i in 5 downTo 1) {
    println(i)
}
```

#### Until

```kotlin
for (i in 0 until 5) {
    println(i)
}
```

### Array Sorting

#### Without Built-in Function

Implement a sorting algorithm such as Bubble Sort.

```text
Compare adjacent elements
↓
Swap if required
↓
Repeat until sorted
```

#### With Built-in Function

```kotlin
val arr = intArrayOf(5, 2, 8, 1, 3)
arr.sort()

println(arr.joinToString())
```

### Concepts

* Arrays
* Nested arrays
* Loops
* Sorting
* Built-in Kotlin functions

\---

## 1.9 Find Maximum Number from ArrayList

This program finds the maximum number stored in an `ArrayList<Int>`.

### Example

```kotlin
val numbers = arrayListOf(10, 25, 7, 45, 18)

val maximum = numbers.maxOrNull()

println("Maximum Number = $maximum")
```

### Concept Used

* `ArrayList`
* Collections
* Finding maximum value
* `maxOrNull()`

\---

# 1.10 Class and Constructor Creation

This section demonstrates object-oriented programming using a `Car` class.

## Car Properties

* Type
* Model
* Price
* Owner
* Miles Driven

## Functions

The class provides functions to:

* Get car information
* Get original car price
* Calculate current car price
* Display complete car information

### Example Structure

```kotlin
class Car(
    val type: String,
    val model: String,
    val price: Double,
    val owner: String,
    val milesDriven: Double
) {

    fun getCarInformation() {
        println("Type: $type")
        println("Model: $model")
        println("Owner: $owner")
    }

    fun getOriginalPrice(): Double {
        return price
    }

    fun getCurrentPrice(): Double {
        return price - (milesDriven \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\* 0.1)
    }

    fun displayCarInformation() {
        println("Type: $type")
        println("Model: $model")
        println("Price: $price")
        println("Owner: $owner")
        println("Miles Driven: $milesDriven")
    }
}
```

### Concepts

* Class
* Object
* Primary constructor
* Properties
* Member functions
* Encapsulation

\---

# 1.11 Operator Overloading and Matrix Operations

This section demonstrates **operator overloading** and matrix operations using a `Matrix` class.

## Operator Overloading

Operator overloading allows predefined operators such as:

```text
+
-
\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\*
```

to work with user-defined objects.

In Kotlin, operator functions are declared using the `operator` keyword.

### Example

```kotlin
operator fun plus(other: Matrix): Matrix
```

This allows:

```kotlin
val result = matrixA + matrixB
```

instead of calling a separate addition function.

\---


### Customized `toString()`

The `toString()` function is overridden to display matrix elements in a readable format.

Example output:

```text
1 2 3
4 5 6
7 8 9
```

\---

# ▶️ How to Run

## Using IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Create or open a Kotlin project.
3. Add the required `.kt` file.
4. Write or paste the program.
5. Run the `main()` function.
6. Enter the required input in the console.

## Using Android Studio

1. Create/open a Kotlin project.
2. Create a Kotlin file.
3. Add the program code.
4. Run the Kotlin program from the IDE.

## Using Kotlin Compiler

```bash
kotlinc Main.kt -include-runtime -d Main.jar
java -jar Main.jar
```

\---

# 🧠 Key Kotlin Concepts Learned

|No.|Concept|
|-:|-|
|1|Variables and Data Types|
|2|Type Conversion|
|3|User Input|
|4|Conditional Statements|
|5|`when` Expression|
|6|Functions|
|7|Recursion|
|8|Arrays|
|9|Loops|
|10|Sorting|
|11|ArrayList|
|12|Classes|
|13|Constructors|
|14|Objects|
|15|Operator Overloading|
|16|Matrix Operations|
|17|`toString()` Overriding|

\---

# ✅ Conclusion

Practical 1 provides a foundation in **Kotlin programming and object-oriented programming**. It covers basic syntax as well as important programming concepts such as functions, recursion, collections, classes, constructors, operator overloading, and matrix manipulation.

By completing these programs, students gain practical experience in writing, executing, and understanding Kotlin programs.

---

**Enrollment No:** 24012011117  
**Practical:** 01
