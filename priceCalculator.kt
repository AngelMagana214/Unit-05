import java.util.Scanner

fun priceCalculator(wholesaleCost: Double, markupPercentage: Double): Double {
    val markupAmount = wholesaleCost * markupPercentage / 100

    return wholesaleCost + markupAmount
}

fun main() {
    val scanner = Scanner(System.`in`)

    print("Item wholesale cost: ")

    val wholesaleCost = scanner.nextDouble()
    print("Item markup percentage: ")

    val markupPercentage = scanner.nextDouble()

    val retailPrice = priceCalculator(wholesaleCost, markupPercentage)
    println("Retail price is $retailPrice")
}
