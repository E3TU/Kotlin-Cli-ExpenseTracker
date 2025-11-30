data class Expense(val description: String, val amount: Double)

class ExpenseTracker {
    private val expenses = mutableListOf<Expense>()

    fun addExpense(description: String, amount: Double) {
        expenses.add(Expense(description, amount))
        println("Expense added")
    }

    fun viewExpenses() {
        if (expenses.isEmpty()) {
            println("No expenses.")
        } else {
            println("Expenses:")
            expenses.forEachIndexed { index, expense ->
                println("${index + 1}. ${expense.description} - ${expense.amount}€")
            }
        }
    }

    fun totalExpense() {
        val total = expenses.sumOf { it.amount }
        println("Total expense: $total€")
    }
}

fun main() {

    val expenseTracker = ExpenseTracker()

    while (true) {
        println("")
        println("Welcome to expense tracker")
        println("1. Add an expense")
        println("2. View all expenses")
        println("3. View total expense")
        println("4. Exit program")
        print("Choose an option: ")

        val option: String = readln()

        when (option) {
            "1" -> {
                print("Enter expense description: ")
                val description: String = readln()
                print("Enter expense amount: ")
                val amount: String = readln()
                expenseTracker.addExpense(description, amount.toDouble())
            }
            "2" -> {
                expenseTracker.viewExpenses()
            }
            "3" -> {
                expenseTracker.totalExpense()
            }
            "4" -> {
                println("Exiting program...")
                break
            }
            else -> {
                println("")
                println("Invalid option try again")
                println("")
            }
        }
    }
}
