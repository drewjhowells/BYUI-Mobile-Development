// Variables
fun variablesSection() {
    println("Variables:")
    // Introduction to Variables: Variables are used to store data that can change during the execution of a program.
    var age: Int = 25
    val name: String = "John"
    println("My name is $name and I am $age years old.")

    // Example problem for Variables: Calculate the area of a rectangle given its length and width.
    val length = 10
    val width = 5
    val area = length * width
    println("Area of the rectangle is: $area")
}

// Conditionals
fun conditionalsSection() {
    println("\nConditionals:")
    // Introduction to Conditionals: Conditionals allow us to make decisions in our code based on certain conditions.
    val x = 10
    val y = 20
    if (x > y) {
        println("x is greater than y")
    } else {
        println("x is not greater than y")
    }

    // Example problem for Conditionals: Determine if a number is even or odd.
    val numberToCheck = 7
    if (numberToCheck % 2 == 0) {
        println("$numberToCheck is even")
    } else {
        println("$numberToCheck is odd")
    }
}

// Loops
fun loopsSection() {
    println("\nLoops:")
    // Introduction to Loops: Loops allow us to execute a block of code repeatedly.
    for (i in 1..5) {
        println("Count: $i")
    }

    // Example problem for Loops: Print the multiplication table of a given number.
    val tableOf = 3
    for (i in 1..10) {
        println("$tableOf * $i = ${tableOf * i}")
    }
}

// Functions
fun functionsSection() {
    println("\nFunctions:")
    // Introduction to Functions: Functions are blocks of code that perform a specific task.
    fun add(a: Int, b: Int): Int {
        return a + b
    }
    println("2 + 3 = ${add(2, 3)}")

    // Example problem for Functions: Write a function to check if a given number is prime.
    fun isPrime(number: Int): Boolean {
        if (number <= 1) return false
        for (i in 2 until number) {
            if (number % i == 0) return false
        }
        return true
    }
    val numberToCheckPrime = 17
    println("$numberToCheckPrime is prime: ${isPrime(numberToCheckPrime)}")
}

// Classes
fun classesSection() {
    println("\nClasses:")
    // Introduction to Classes: Classes are blueprints for creating objects that have properties and behaviors.
    class Person(val name: String, var age: Int) {
        fun speak() {
            println("Hello, my name is $name and I am $age years old.")
        }
    }
    val person = Person("Alice", 30)
    person.speak()

    // Example problem for Classes: Create a class representing a Bank Account with deposit and withdraw methods.
    class BankAccount(var balance: Double) {
        fun deposit(amount: Double) {
            balance += amount
            println("Deposit successful. New balance: $balance")
        }

        fun withdraw(amount: Double) {
            if (amount <= balance) {
                balance -= amount
                println("Withdrawal successful. New balance: $balance")
            } else {
                println("Insufficient funds")
            }
        }
    }
    val account = BankAccount(100.0)
    account.deposit(50.0)
    account.withdraw(30.0)
}

// Lambda Functions
fun lambdaFunctionsSection() {
    println("\nLambda Functions:")
    // Introduction to Lambda Functions: Lambda functions are anonymous functions that can be passed as arguments.
    val multiply: (Int, Int) -> Int = { a, b -> a * b }
    println("2 * 3 = ${multiply(2, 3)}")

    // Example problem for Lambda Functions: Write a lambda function to find the square of a number.
    val square: (Int) -> Int = { it * it }
    val numberToSquare = 6
    println("Square of $numberToSquare is: ${square(numberToSquare)}")
}

// Example problem for each section
// Problem Section
fun problemSection() {
    println("\nProblem Section:")

    // Problem for Variables: Fix the variable declaration to store the temperature of a city.
    println("\nProblem for Variables:")
    // Sample code with a variable declaration missing syntax.
    var cityTemperature // Fix the variable declaration to store the temperature of a city.
    cityTemperature = 25
    println("The temperature of the city is $cityTemperature degrees Celsius.")

    // Problem for Conditionals: Fix the conditional to determine if a number is positive, negative, or zero.
    println("\nProblem for Conditionals:")
    // Sample code with a conditional missing syntax.
    val numberToCheck: Int = -7 // Fix the conditional to determine if a number is positive, negative, or zero.
    if numberToCheck > 0 {
        println("$numberToCheck is positive")
    else if (numberToCheck < 0) {
        println("$numberToCheck is negative")
    } else {
        println("$numberToCheck is zero")
    }

    // Problem for Loops: Fix the loop to print numbers from 1 to 10.
    println("\nProblem for Loops:")
    // Sample code with a loop missing syntax.
    println("Printing numbers from 1 to 10:")
    for (i  1..10) {
        print("$i ")
    }

    // Problem for Classes: Fix the class definition to represent a Car with properties and methods.
    println("\n\nProblem for Classes:")
    // Sample code with a class definition missing syntax.
    // Fix the class definition to represent a Car with properties and methods.
    class Car {
        var brand: String
        var model: String
        var year: Int

        constructor(brand: String, model: String, year: Int) {
            this.brand = brand
            this.model = model
            this.year = year
        }
        fun displayDetails() {
            println("Car Details:")
            println("Brand: $brand")
            println("Model: $model")
            println("Year: $year")
        }
    val car = Car("Toyota", "Camry", 2020)
    car.displayDetails()

    // Problem for Functions: Fix the function definition to calculate the factorial of a given number.
    println("\nProblem for Functions:")
    // Sample code with a function definition missing syntax.
    // Fix the function definition to calculate the factorial of a given number.
    fun factorial(n: Int): Int {
        return if (n == 0) {
            1
            else {
                n * factorial(n - 1)
            }
    }
    val number = 5
    println("Factorial of $number is ${factorial(number)}")

    // Problem for Lambda Functions: Fix the lambda function to multiply two numbers.
    println("\nProblem for Lambda Functions:")
    // Sample code with a lambda function missing syntax.
    // Fix the lambda function to multiply two numbers.
    val multiply: (Int, Int) -> Int = { a, b -> a * b }
    println("2 * 3 = ${multiply(2, 3)}")
}