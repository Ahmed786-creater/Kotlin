open  class Car(var brandName: String,var color: String) {
    fun speedup(){
        println("340 speed")
    }
    fun applybrake(){
        println("not so good")
    }
    open fun maxSpeed(){
        println("happy na now")
    }
}