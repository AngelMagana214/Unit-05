import java.util.*

fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return number % divisor == 0
}

fun isPrime(number: Int): Boolean {
    if (number < 2) {
        return false
    }
    for (i in 2..(Math.sqrt(number.toDouble())).toInt()) {
        if (isNumberDivisible(number, i)) {
            return false
        }
    }
    return true
}

fun getInput(): Int {
    val input = Scanner(System.`in`)
    var number: Int
    while (true) {
        try {
            print("Enter a number to check if it is prime: ")
            number = input.nextInt()
            break
        } catch (e: InputMismatchException) {
            println("Invalid input. Please enter a valid integer.")
            input.next()
        }
    }
    return number
}

fun main(args: Array<String>) {
    val number = getInput()
    val isNumberPrime = isPrime(number)
    println("is $number prime: $isNumberPrime")

    println(isPrime(6)) // false
    println(isPrime(13)) // true
    println(isPrime(8893)) // true
}
