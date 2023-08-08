fun main(args: Array<String>) {
    println("enter your age")

    var myage:Int = readLine()!!.toInt()

    if (myage >= 18) {
        print("welcome to the club")
    }else{
        print("sorry cannot admit an underage")
    }
}