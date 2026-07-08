fun main(){
    val c = Car("BMW")
    println(c.model)
}
class Car(m: String){
    var model: String = ""
    var price: Double = 0.0

    init{
        model = m
    }
}