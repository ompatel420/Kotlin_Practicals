fun main() {
    val arr = IntArray(5)

    for(i in 0..<arr.size){
        print("a[$i]=")
        arr[i] = readln().toInt()
    }
    var max = arr[0]
    for(i in arr){
        if(i > max){
            max = i
        }
    }
    println("Maximum value = $max")
}

//fun main() {
//    val list = ArrayList<Int>()
//    println("Enter 5 ArrayList elements:")
//    for (i in 0 until 5) {
//        print("a[$i] = ")
//        list.add(readln().toInt())
//    }
//    println("\nEntered ArrayList:")
//    println(list.joinToString(", "))
//    var max = list[0]
//    for (i in 1 until list.size) {
//        if (list[i] > max) {
//            max = list[i]
//        }
//    }
//    println("\nLargest element = $max")
//}