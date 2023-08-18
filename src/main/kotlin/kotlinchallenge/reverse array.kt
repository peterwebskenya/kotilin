package kotlinchallenge

//4.Reverse Array: Create a function that takes an array of integers as input and returns the array in reverse order.
fun main(args: Array<String>) {
    val arr: Array<Int?> = arrayOf(1,2,3,4,5,6,7,8,9,11,12,13,14)
    arr.reverse();
    println(arr.contentToString())
}