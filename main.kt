data class Expense(val description: String, val amount: Double)

class ExpenseTracker {
    private val expenses = mutableListOf<Expense>()
}


fun main() {
    while (true) {
        println("Welcome to expense tracker")
        println("1. Add an expense")
        println("2. View all expenses")
        println("3. View total expense")
        println("4. Exit program")
        print("Choose an option: ")

        val option: String = readln()

        when (option) {
            "1" -> {
                
            }
            "2" -> {
                
            }
            "3" -> {
                
            }
            "4" -> {
                
            }
            else -> {
                println("")
                println("Invalid option try again")
                println("")
            }
        }
}