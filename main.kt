fun main(){
    val res1 = Restaurant("cd",4.1,400)
    val res2 = Restaurant("abc",4.0,300)
    val res3 = Restaurant("Kfc",3.1,1200)
    val res4 = Restaurant("asgola",1.1,4500)
    val res5 = Restaurant("TFC",2.1,100)
    var restaurantList = mutableListOf(res1,res2,res3)
    restaurantList.add(res4)
    restaurantList.add(res5)
    for(res in restaurantList)
    {
        println(res)
    }



}