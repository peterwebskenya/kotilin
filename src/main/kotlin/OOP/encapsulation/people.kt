package OOP.encapsulation
//offering protection of data to outside world

class people(private val name:String,private val age:Int) {

    fun getpersoninfo():String{
        return "name:$name,age:$age"
    }
}

fun main(args: Array<String>) {
    var person1 = people(name = "bazu", age = 25)

    println(person1.getpersoninfo())
}