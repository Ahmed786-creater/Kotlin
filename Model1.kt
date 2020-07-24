class Model1(brandname: String, color: String):Car(brandname,color) {
    fun num1(){
        println("${brandName} brand name")
        println("${color} color")
    }
    override fun maxSpeed(){
        println("Maximum speed of Honda is 150 kmph")
    }


}