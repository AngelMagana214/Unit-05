fun celsius(fahrenheit: Double): Double {
    return 5.0 / 9.0 * (fahrenheit - 32)
}

fun main() {
    println("°F  | °C")
    println("----|----")
    for (fahrenheit in 0..20) {
        val celsiusTemperature = celsius(fahrenheit.toDouble())
        println("%-3d | %7.2f".format(fahrenheit, celsiusTemperature))
    }
}
