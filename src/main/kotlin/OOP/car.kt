package OOP

import javax.swing.AbstractListModel

class car(make:String, model:String, price:Int) {
    init {
        println("peter owns $make,$model,$price")
        println("make is $make")
        println("model is$model")
        println("price is$price")
    }

}

fun main(args: Array<String>) {
    var owner1 =car(make = "toyota", model = "allion", price = 620000)
    var owner2 =car(make ="bmw", model = "312", price = 5500000)
}