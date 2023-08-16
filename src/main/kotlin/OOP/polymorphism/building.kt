package OOP.polymorphism

import java.lang.reflect.Type

//super class
open class Buildind(val type:String){
    open fun openDoor(){
        println("$type door is opening")
    }
}

//sub class
class House(type:String) : Buildind(type){
    override fun openDoor(){
        println("$type house door is opening")
    }
}
class Apartment(type: String):  Buildind(type){
    override fun openDoor(){
        println("$type apartmentdoor is opening")
    }
}
class Office(type:String): Buildind(type){
    override fun openDoor() {
        println("$type officedoor is opening")
    }
}

fun main(args: Array<String>) {
    var buildind1:Buildind=House(type = "the bungalow")   //house object is being like a building
    buildind1.openDoor() //calls the overriden method in house

    var buildind2:Buildind =Apartment(type = "studio")
    buildind2.openDoor()//calls the overriden method in apartment

    var buildind3:Buildind=Office(type = "office")
    buildind3.openDoor()//calls the overriden method in office
}