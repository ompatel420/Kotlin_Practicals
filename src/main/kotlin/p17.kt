fun main() {
    println("Enter the Number:")
    val number = readln().toInt()

    println("Factorial of $number = ${factorial(number)}")
}
fun factorial(n: Int): Long {
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}