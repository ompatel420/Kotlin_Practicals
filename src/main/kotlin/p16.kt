fun main(){
    println("Enter the First NUmber:")
    val number1 = readln().toInt()
    println("Enter the Second Number:")
    val number2 = readln().toInt()

    println("Addition: ${add(number1, number2)}, Subtraction: ${subtract(number1, number2)}, Multiplication: ${multiply(number1, number2)}, Division: ${divide(number1, number2)}")
}
fun add(number1: Int, number2: Int): Int{
    return number1 + number2
}
fun subtract(number1: Int, number2: Int): Int {
    return number1 - number2
}
fun multiply(number1: Int, number2: Int): Int {
    return number1 * number2
}
fun divide(number1: Int, number2: Int): Int {
    return number1 / number2
}