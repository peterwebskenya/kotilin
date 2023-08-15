package OOP

 open class Animal(color:String,legs:String,gender:String,breed:String) {
    init {
        println("color is $color and it has$legs of $breed and its a $gender")
    }
}

class dog(name:String) : Animal(color = "white", legs = "4legs", breed = "german shepherd", gender = "male"){


}
fun nameofdog(){
    println("bosco")
}
fun main(args: Array<String>) {
    var dog1= dog(name = "bosco")

    dog1.toString()

}