import java.util.Calendar

fun main(args: Array<String>) {
    print("enter year born")
    var birthyear = readLine()!!.toInt()

    var currentyear = Calendar.getInstance().get(Calendar.YEAR)
    var age  =  currentyear - birthyear
    println("you are $age years old")

}












