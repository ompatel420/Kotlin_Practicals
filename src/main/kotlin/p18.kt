fun main(){
    println("Create Array-1 by using arrayof() method: ")
    val array1 = arrayOf(10,90,60,80,100)
    println(array1.contentToString())
    println()
    println("Create Array-2 by using Array<>():")
    val array2 = Array(5) {0}
    println(array2.contentToString())
    println()
    println("Create Array-3 by using Array<>() and lambda function:")
    val array3 = Array(8) {index->index}
    println(array3.contentToString())
    println()
    println("Create Array-4 by using IntArray():")
    val array4 = IntArray(5)
    println(array4.contentToString())
    println()
    println("Create Array-5 by using intArrayOf():")
    val array5 = intArrayOf(12,10,5,18,19)
    println(array5.contentToString())
    println()

    println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
    val array6 = arrayOf(
        intArrayOf(1, 3),
        intArrayOf(4, 5),
        intArrayOf(6, 7)
    )
    println(array6.contentDeepToString())
    println()

    println("Please enter Array value:")
    val userArray = IntArray(5)

    for(i in 0..<5){
        print("a[$i]=")
        userArray[i] = readln().toInt()
    }
    println("Entered Array:")
    println(userArray.contentToString())
    println()

    println("*".repeat(45) + "With Built-in Function" + "*".repeat(45))
    println("After sorting by built-in function:")
    userArray.sort()  // Sorts the array in-place (ascending order)
    println(userArray.contentToString())
    println()

    println("*".repeat(44) + "Without Built-in Function" + "*".repeat(45))
    val userArrayCopy = userArray.copyOf()  // Deep copy to avoid modifying sorted array

    println("Before Sorting:")
    println(userArrayCopy.contentToString())
    println()

    for (i in userArrayCopy.indices) {
        for (j in 0..<userArrayCopy.size - 1 - i) {
            if (userArrayCopy[j] > userArrayCopy[j + 1]) {
                val temp = userArrayCopy[j]
                userArrayCopy[j] = userArrayCopy[j + 1]
                userArrayCopy[j + 1] = temp
            }
        }
    }

    println("After Sorting without built-in function:")
    println(userArrayCopy.contentToString())
    println()
}
//********************************************************************
//fun main(){
//    val a1 = arrayOf('A','B','C','D','E')
//    println(a1.joinToString())
//
//    val a2 = Array<Int>(5){10}
//    println(a2.joinToString())
//
//    val a3 = Array<Int>(5){i -> i*2}
//    println(a3.joinToString())
//
//    a3.shuffle()
//    println(a3.joinToString())
//
//    a3.sort()
//    println(a3.joinToString())
//}

//************************************************************

//fun main() {
//
//    // Array-1 using arrayOf()
//    println("Create Array-1 using arrayOf():")
//    val arr1 = arrayOf(10, 90, 60, 80, 100)
//    println(arr1.contentToString())
//
//    // Array-2 using Array()
//    println("\nCreate Array-2 using Array():")
//    val arr2 = Array(5) { 0 }
//    println(arr2.contentToString())
//
//    // Array-3 using Array() with Lambda
//    println("\nCreate Array-3 using Array() and Lambda:")
//    val arr3 = Array(8) { it }
//    println(arr3.contentToString())
//
//    // Array-4 using IntArray()
//    println("\nCreate Array-4 using IntArray():")
//    val arr4 = IntArray(5)
//    println(arr4.joinToString(", "))
//
//    // Array-5 using intArrayOf()
//    println("\nCreate Array-5 using intArrayOf():")
//    val arr5 = intArrayOf(12, 10, 1, 5, 18, 19)
//    println(arr5.joinToString(", "))
//
//    // 2D Array
//    println("\nCreate 2D Array using arrayOf() and intArrayOf():")
//    val arr6 = arrayOf(
//        intArrayOf(1, 3),
//        intArrayOf(4, 5),
//        intArrayOf(6, 7)
//    )
//
//    // Kotlin function
//    println(arr6.contentDeepToString())
//
//    // User Input
//    val a = IntArray(5)
//
//    println("\nPlease Enter Array Values:")
//
//    for (i in a.indices) {
//        print("a[$i] = ")
//        a[i] = readln().toInt()
//    }
//
//    println("\nEntered Array:")
//    println(a.joinToString(", "))
//
//    // Range Loop (..)
//    println("\nPrinting using Range (..):")
//    for (i in 0..a.lastIndex) {
//        print("${a[i]} ")
//    }
//
//    // Until Loop
//    println("\n\nPrinting using until:")
//    for (i in 0 until a.size) {
//        print("${a[i]} ")
//    }
//
//    // downTo Loop
//    println("\n\nPrinting using downTo:")
//    for (i in a.lastIndex downTo 0) {
//        print("${a[i]} ")
//    }
//
//    // Sorting with Built-in Function
//    println("\n\n******** WITH BUILT-IN FUNCTION ********")
//
//    val builtIn = a.copyOf()
//    builtIn.sort()
//
//    println("After Sorting:")
//    println(builtIn.joinToString(", "))
//
//    // Sorting without Built-in Function (Bubble Sort)
//    println("\n******** WITHOUT BUILT-IN FUNCTION ********")
//
//    val bubble = a.copyOf()
//
//    println("Before Sorting:")
//    println(bubble.joinToString(", "))
//
//    for (i in 0 until bubble.size - 1) {
//        for (j in 0 until bubble.size - i - 1) {
//            if (bubble[j] > bubble[j + 1]) {
//                val temp = bubble[j]
//                bubble[j] = bubble[j + 1]
//                bubble[j + 1] = temp
//            }
//        }
//    }
//
//    println("\nAfter Sorting:")
//    println(bubble.joinToString(", "))
//}