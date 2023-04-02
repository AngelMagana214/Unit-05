import java.util.Scanner

fun calculateProfit(
    numberOfShares: Int,
    purchasePrice: Double,
    purchaseCommission: Double,
    salePrice: Double,
    saleCommission: Double
): Double {
    return (numberOfShares * salePrice - saleCommission) - (numberOfShares * purchasePrice + purchaseCommission)
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter number of shares:")
    val numberOfShares = scanner.nextInt()

    println("Enter purchase price per share:")
    val purchasePrice = scanner.nextDouble()

    println("Enter purchase commission paid:")
    val purchaseCommission = scanner.nextDouble()

    println("Enter sale price per share:")
    val salePrice = scanner.nextDouble()

    println("Enter sale commission paid:")
    val saleCommission = scanner.nextDouble()

    val profit = calculateProfit(numberOfShares, purchasePrice, purchaseCommission, salePrice, saleCommission)
    if (profit > 0) {
        println("Sale of the stock had a profit of $%.2f".format(profit))
    } else if (profit < 0) {
        println("Sale of the stock had a loss of $%.2f".format(-profit))
    } else {
        println("Sale of the stock had no profit or loss.")
    }
}
