fun main(args: Array<String>) {

//this is function with out parameter

//  sayhello()
    printsum(num1= 11, num2= 3)

}


//fun sayhello(){
//    print("hello")
//}

fun printsum(num1: Int, num2: Int){
    val sum =sumnumbers(num1, num2)
    print(sum)
}

fun sumnumbers(num1:Int,num2:Int):Int{
    return num1 + num2
}
