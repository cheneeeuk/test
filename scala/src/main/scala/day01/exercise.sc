object exercise{
    /**
      * 题目1
      * 针对下列java循环写一个scala版本
      * for(int i=10;i>=0;i--)
      * System.out.println(i);
      */
    for(i <- 10 to 1 by -1)println(i)
    for(i <- 1 to 10 reverse)println(i)
    /**
      * 题目2
      * 一个空的块表达式{}的值是什么？类型是什么
      */
    print({})
    /**
      * 题目3
      * 编写一个函数countdown(n:Int)，打印从n到0的数字
      */
    def countdown(n:Int)={
        for(i <- n to 0 by -1) println(i)
    }
    countdown(10)
    /**
      * 题目4
      * 编写函数计算x的n次方，其中n是整数，要考虑n是0，正偶数
      * 正奇数，负数，这几种情况
      */
    def cowNum(x:Int,n:Int)={
        var result:Double = 1
        if(n == 0){
            1
        }else if(n > 0){
            for(i <- n to 1 by -1){
                result = result * x
            }
        }else if(n < 0){
            var m = -1 * n
            for(i <- m to 1 by -1){
                result = result * x
            }
            result = 1/result
        }
        result
    }

    val result = cowNum(2,10)
    /**
      * 题目5
      * 编写一个循环，将整数数组中相邻的元素置换
      * var a1=Array(1,2,3,4,5,6)
      */
    var a1=Array(1,2,3,4,5,6,7)

    for(index <- 0 until a1.length-1 by 2){
        val temp = a1(index)
        a1(index) = a1(index+1)
        a1(index+1) = temp
    }
    var a2 = a1

    /**
      * 题目6
      * 创建一个Map，包含一些你想要的一些装备，以及他们的价格。然后通过yield 构建另一个Map映射，采用同一组键，但是价格上打9折
      * var m1=Map("book"->10,"gun"->100,"ipad"->1000)
      */
    var m1=Map("book"->10,"gun"->100,"ipad"->1000)
    var m2=for((k,v)<-m1)yield{(k,v*0.9)}

}