fun main(args: Array<String>) {
    println("select option")
    var dial = readLine()!!.toInt()
    when(dial){
        0-> print("tik tok bundle")
        1-> print("sh20=1GB,Ihr")
        2-> print("makeUrbundle")
        3-> print("BLAZEdeals")
        4-> print("DAILY")
        5-> print("WEEKLY")
        6-> print("GO MONTHLY")
        7-> print("videos")
        8-> print("Okoa data")
        9-> print("lipa mdogo")
        10-> print("sh10=1GB,youtube,3hrs")

        else ->("0:BACK 98:MORE")
    }
}