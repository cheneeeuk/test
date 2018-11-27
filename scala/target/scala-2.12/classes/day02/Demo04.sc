import java.util

import scala.util.Sorting.quickSort

object Demo03{


    val l1=List(("tom",29),("tom",28),("tom",27),("tom",24))
    l1.map(x=>x._2).max

    val l2=List("hello world","hello hadoop","hello hadoop")
    val l3=l2.flatMap(x=>x.split(" "))
    val l4=l3.groupBy(x=>x)
    val l5=l4.map(x=>(x._1,x._2.size))


    val l6=l2.flatMap(x=>x.split(" ")).map(x=>(x,1))
    l6.groupBy(x=>x._1)
}