class Model2(brandname: String, color: String):Car(brandname,color) {
    fun num2(){
        println("${brandName} brand name")
        println("${color} color")
    }

    override fun maxSpeed(){
        println("Maximum speed of Hyundai is 120 kmph")
    }
}