class Laptop {
    var Ram = 4
    var Brand = " Hp"
    var hardDisk= "1 tb"

    fun performComputations(){
        println(" i perform computation ")
    }
    fun ahmed(){
        println("${Ram} pC ram Size")
    }
    fun sid(){
        println("${Brand} Pc brands")
    }

}
fun main(){
    val laptop= Laptop()
   laptop.Ram = 8
    laptop.Brand= "Dell"
    laptop.ahmed()
    laptop.sid()
    laptop.performComputations()

}