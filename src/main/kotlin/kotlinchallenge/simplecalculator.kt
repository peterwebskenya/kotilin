package kotlinchallenge

fun main(args: Array<String>) {
    println("enter first number:")
    var num1 = readLine()!!.toDouble()

    println("enter the second number:")
    var num2 = readLine()!!.toDouble()

    println("enter the operator (+,-,*,/):")
    var operator = readLine()

    if ( num1 ==null || num2 == null || operator == null){
        println("error")
        return
    }
    var result = when (operator){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" ->{
            if(num2 !=0.0){num1/num2
            }else{
                println("division by zero is not allowed")
                return
            }
        }
        else ->{
            println("invalid operator")
            return
        }

    }
    println("results: $result")

}