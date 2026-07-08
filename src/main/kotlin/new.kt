fun main(){
    val c = Car1("BMW", 10000.0)
    println(c.model)
    println(c.price)
}
open class Car1(var model: String){
    var price: Double = 0.0
    constructor(m: String, p: Double) : this(m){ price = p}
}
class Suzuki(m: String) : Car1(m){}