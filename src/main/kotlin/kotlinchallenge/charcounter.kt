package kotlinchallenge


fun Charactercountoccurence(userinput:String,chartag:Char): Int{
    var charCount =0
    for (x in userinput){
        if (x==chartag){
            charCount +=1
        }
    }
    return charCount
}
fun main(args: Array<String>) {

    println("enter any word")
    var dataStringinput = readLine() ?: ""
    println("enter any letter to check for occurences")
    var mytargetChar = readLine() ?.get(0)?: ' '

    var CharOccurence = Charactercountoccurence(dataStringinput,mytargetChar)
    println("$mytargetChar appears $CharOccurence number of times")


}