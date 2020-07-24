fun main(){
    val stu1 = Student("aman",3,34)
    val stu2 = Student("am",2,84)
    val stu3 = Student("a",33,44)
    val stu4 = Student("n",36,94)
    val stu5 = Student("af",43,64)
    val stu6 = Student("th",73,24)
    val stu7 = Student("tg",43,74)
    val stu8 = Student("fg",13,44)
    val stu9 = Student("gg",93,84)
    val stu10 = Student("ae",83,99)

    var Stulist = mutableListOf(stu1,stu2,stu3,stu4,stu5,stu6,stu7,stu8,stu9,stu10)
    for ( stu in Stulist){
        println(stu)
    }
}