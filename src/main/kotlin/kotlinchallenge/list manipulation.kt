package kotlinchallenge

fun main(args: Array<String>) {
    fun printEvenNumbers(numbers: List<Int>): Unit {
        for (number in numbers) {
            if (number % 2 == 0) {
                println(number)
            }
        }
    }


        val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14,15,16,17,18,19)
        printEvenNumbers(numberList)


















































}