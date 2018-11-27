import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting.quickSort

object Demo02{
    val a1 = Array(2,1,3,5,7)
    quickSort(a1)
    val a2 = a1.reverse
    a2.take(3)
    a1.takeRight(3)

    val l5=List(1,2,3,4)
    l5.drop(1)

    l5.exists(_%2==0)

    l5.filter(_%2==0)

    l5.map(_.toString)

    l5.mkString(",")

    l5.sortBy(x=> -x)

    l5.intersect(l5)

    val l1=List("hello","hello","world","hadoop")
    val l2=l1.map(x=>(x,1))
    val l3=l2.map(x=>x._1)


}