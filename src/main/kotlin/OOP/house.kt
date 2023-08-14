package OOP

import javax.xml.stream.Location

class house(plot_number:Int,rent:Int,location:String) {
    init {
        println("plot_number is $plot_number")
        println("rent is $rent")
        println("location $location")
    }
}

fun main(args: Array<String>) {
    var owner1 =house(plot_number = 312, rent = 20000, location = "kasarani")
}