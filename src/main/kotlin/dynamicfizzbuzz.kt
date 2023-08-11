import java.util.*

fun main(args: Array<String>) {


//    for the ranges 1..100
//    user type to enter first and second number
    fun main(args: Array<String>) {

//    using for loop and range of number 1..100
//    numbers divisible by 3 and 5 print fizzbuzz
//    numbers divisible by 3 print fizz
//    numbers divisible by 5 print buzz

        for (x in 1..100) {
            if (x % 3 == 0 && x % 5 == 0) {

                println("$x is fizzbuzz")
            } else if (x % 3 == 0 && x % 5 != 0) {

                println("$x is fizz")
            } else if (x % 5 == 0 && x % 3 != 0)
                println("$x is Buzz")
            else
                println(x)
        }




    }

    println("enter first number")
    var num1 = readLine()!!.toInt()
    println("enter second number")
    var num2 = readln()!!.toInt()
    for (x in num1 ..num2){
        if (x % 3 == 0 && x % 5 == 0) {

            println("$x is fizzbuzz")
        } else if (x % 3 == 0 && x % 5 != 0) {

            println("$x is fizz")
        } else if (x % 5 == 0 && x % 3 != 0)
            println("$x is Buzz")
        else
            println(x)





}
}