import java.util.Scanner
import kotlin.random.Random

enum class Choice {
    ROCK, PAPER, SCISSORS
}

fun generateComputerChoice(): Choice {
    return when (Random.nextInt(1, 4)) {
        1 -> Choice.ROCK
        2 -> Choice.PAPER
        else -> Choice.SCISSORS
    }
}

fun getUserChoice(scanner: Scanner): Choice? {
    println("Enter your choice (rock, paper, scissors):")
    val input = scanner.next().toUpperCase()
    return try {
        Choice.valueOf(input)
    } catch (e: IllegalArgumentException) {
        null
    }
}

fun determineWinner(userChoice: Choice, computerChoice: Choice): String {
    return if (userChoice == computerChoice) {
        "tie"
    } else {
        when (userChoice) {
            Choice.ROCK -> if (computerChoice == Choice.SCISSORS) "You" else "computer"
            Choice.PAPER -> if (computerChoice == Choice.ROCK) "You" else "computer"
            Choice.SCISSORS -> if (computerChoice == Choice.PAPER) "You" else "computer"
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    var userChoice: Choice?
    var computerChoice: Choice
    var winner: String = ""

    do {
        computerChoice = generateComputerChoice()
        userChoice = getUserChoice(scanner)

        if (userChoice == null) {
            println("Invalid input. Please enter rock, paper, or scissors.")
            continue
        }

        println("Computer's choice: ${computerChoice.name.toLowerCase()}")
        winner = determineWinner(userChoice, computerChoice)

        if (winner == "tie") {
            println("It's a tie! Play again.")
        } else {
            println("The winner is: $winner")
        }
    } while (winner == "tie")
}
