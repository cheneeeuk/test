object Demo08{
    def f1(a:Int,b:Int)={
        a+b
    }
    //--声明一个匿名函数
    //--匿名函数没有函数名，形式：（参数列表）=>｛方法体｝
    //--匿名函数最大的作用，是结合高阶函数，当作参数进行传递
    (a:Int,b:Int)=>a+b

    def f2(a:Int,b:Int,f:(Int,Int)=>Int)={
        f(a,b)
    }

    f2(1,2,(a:Int,b:Int)=>a+b)
    f2(1,2,(a:Int,b:Int)=>a-b)
    f2(1,2,(a:Int,b:Int)=>a*b)
    f2(1,2,(a:Int,b:Int)=>a/b)

    def f3(a:String,f:(String)=>Array[String])={
        f(a)
    }

    f3("hello,world",(a:String)=>{a.split(",")})

    def f4(a:String,b:Int,f:(String,Int)=>{})={
        f(a,b)
    }

    f4("hello",3,(a:String,b:Int)=>{a*b})

    f3("hello,world",a=>a.split(","))

    val a1=Array(1,2,3,4,5)

    a1.filter(num=>num>3)

    a1.foreach(a=>println(a))

    a1.reduce((a:Int,b:Int)=>a+b)

    a1.reduce((a,b)=>a*b)

    a1.reduce(_*_)

    a1.filter(_>3)

    f3("hello,world",_.split(","))











}