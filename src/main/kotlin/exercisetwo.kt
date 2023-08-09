fun main(args: Array<String>) {

    println("enter your marks")
    var marks:Int = readLine()!!.toInt()
                // 10-29 E
                // 30-39 D
                //40 -59 C
                // 60-70 B
                // 71-100 A
                // Above 100  invalid marks

//    if (marks >= 50){
//        print("congratulations you passed your exam")
//            }
//    else{
//        print("sorry ypu have to do a resit")
//    }



//     if (marks <= 29){
//        println("E")
//    }
//    if (marks <= 39){
//        println("D")
//
//    }
//    if (marks <=59){
//        println("c")
//
//    }
//    if (marks <=70){
//        println("B")
//
//    }
//    if (marks <=100){
//        println("A")
//
//    }
//    if (marks >100){
//        println("invalid grade")
//
  //  }
//    println("enter your marks")
// var marks = readline()!!.toint()


    if (marks in 1..29){
        println("E")

    }
    else if (marks in 30..39){
        println("D")

    }
    else if (marks in 40..59){
        println("C")

    }
    else if (marks in 60..70){
        println("B")

    }
    else if (marks in 71..100){
        println("A")

    }
    else{
        println("invalid grade")

    }    }



         
