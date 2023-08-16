package kotlinchallenge

fun main(args: Array<String>) {
    println("What's your name?")
    val name = readln()

    if (name.isBlank()  ){
        println("please enter a valid name")
    }else{
        println("Hello, $name!")
    }

}