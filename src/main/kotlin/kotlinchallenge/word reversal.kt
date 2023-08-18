package kotlinchallenge

//1.Word Reversal: Create a program that takes a sentence as input and prints the words in reverse order.
fun main(args: Array<String>) {

    println("enter any word")
    var words = readLine()?:""
    var wordsplit = words.split(" ")
    var wordsreverse=wordsplit.reversed()
    println(wordsreverse.joinToString (" "))
}