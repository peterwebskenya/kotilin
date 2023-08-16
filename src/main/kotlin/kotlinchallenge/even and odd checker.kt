package kotlinchallenge

fun main(args: Array<String>) {
    println("Enter an integer")
    var num = readLine()!!.toInt()
    if(num == null){
        println("please enter a valid number")
    }else{

    }
    if(num % 2 == 0){
        println("Even number")
    }else{
        println("Odd number")
    }
}