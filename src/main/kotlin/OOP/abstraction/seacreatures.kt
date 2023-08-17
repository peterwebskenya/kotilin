package OOP.abstraction

abstract class seacreatures(val name:String) {
//    abstract method
    abstract fun makesound()
//    genaral method
    fun describe(){
        print("$name is a sea creature")
    }

}

//subclass of a sea creature
 class fish(name: String): seacreatures(name){
    override fun makesound() {
        println("$name makes a blup blup sound")
    }
 }
//another subclass
class whale(name: String): seacreatures(name){
    override fun makesound() {
        println("$name makes a deep underwater noise")
    }
}

fun main(args: Array<String>) {
    val creature1:seacreatures = fish(name = "nemo")
    val creature2:seacreatures = whale(name = "Octavia")

    creature1.describe()
    creature1.makesound()
    creature2.describe()
    creature2.makesound()
}
