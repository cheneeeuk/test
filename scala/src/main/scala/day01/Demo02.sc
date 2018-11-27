object Demo02{
    println("welcome")
    var s1 = "abcde"
    s1.take(1)
    s1*2
    s1.head
    s1.last
    s1.drop(2)
    s1.tail
    s1.mkString(",")
    s1.foreach(println)

    val i1 = 1
    i1.to(5)
    1 to 5
    i1.to(5,2)


    1.+(2).*(3.toFloat)
}