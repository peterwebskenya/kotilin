package OOP.abstraction

abstract class plants(val name:String) {
    abstract fun Growing()
    fun describe(){
        print("$name is a plant")
    }
}
//sub class of a plant
class tree(name: String):plants(name){
    override fun Growing() {
        println("$name bears sweet fruits")

    }
}
//another subclass
class flower(name: String):plants(name){
    override fun Growing() {
        println("$name has nice scent||smell")
    }
}

fun main(args: Array<String>) {
    val plant1:plants=tree(name = "mango_tree")
    val plant2:plants=flower(name = "rose_flower")

    plant1.Growing()
    plant1.describe()
    plant2.Growing()
    plant2.describe()
}
