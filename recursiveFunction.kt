import java.util.*

fun fibonacci(number: Int): Int {
    if (number <= 0) {
        return 0
    }
    if (number == 1 || number == 2) {
        return 1
    }
    return fibonacci(number - 1) + fibonacci(number - 2)
}

fun getInput(): Int {
    val input = Scanner(System.`in`)
    var number: Int
    while (true) {
        try {
            print("Enter a positive integer to check its Fibonacci value: ")
            number = input.nextInt()
            if (number > 0) {
                break
            } else {
                println("Invalid input fool! Enter a positive integer.")
            }
        } catch (e: InputMismatchException) {
            println("Invalid input. Enter a valid integer!!")
            input.next()
        }
    }
    return number
}

fun main(args: Array<String>) {
    val number = getInput()
    val fibonacciValue = fibonacci(number)
    println("The Fibonacci value for $number is $fibonacciValue")
    println(fibonacci(1))  // = 1
    println(fibonacci(2))  // = 1
    println(fibonacci(3))  // = 2
    println(fibonacci(4))  // = 3
    println(fibonacci(5))  // = 5
    println(fibonacci(6))  // = 8
    println(fibonacci(7))  // = 13
    println(fibonacci(10)) // = 55
}
