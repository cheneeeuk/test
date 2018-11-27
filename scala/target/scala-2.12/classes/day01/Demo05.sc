object Demo05{
    for(i <- 1 to 10 by 3){
        println(i)
    }


//    for(i <- 1 to 9){
//        for(j <- 1 to i){
////            print(i.toString+"*"+j.toString+"="+i.*(j).toString+"\t")
//            print(s"$i*$j=${i.*(j)}\t")
//        }
//        println();
//    }

//    for(i <- 1 to 9; j <- 1 to i;val flag=if(i==j) "\r\n" else "\t"){
//        print(s"$i*$j=${i.*(j)}$flag")
//    }

    val a2 = Array(1,2,3,4)

    val a3 = for(i<-a2)yield{i*2}

    val map = "abc" -> 111
    println(map._1)
    println(map._2)
}