object Demo07{
    def f1():Unit={
        println("hello scala")
    }

    def f2():String={
        println("hello scala")
        ""
    }

    def f3()={
        println("hello")
    }

    def f4()={
        "aa"
    }

    def f5(): Unit ={

    }

    def f6(a:Int,b:Int)={
        a+b
    }

    val r1 = f6(1,2)

    def f7(a:Int,b:Int)=a+b

    val r2 = f7(1,2)

    def f8(a:String)=a.split(",")

    val r3 = f8("hello,world")

    def f9(a:Array[Int])={
        for(b <- a){
            println(b)
        }
    }

    f9(Array(1,2,3,4))

    def f10(a:String,b:String="(",c:String=")")={
        b+a+c
    }

    f10("hello")

    f10("hello","|","|")

    val p1=new Person
    p1.cook()
}