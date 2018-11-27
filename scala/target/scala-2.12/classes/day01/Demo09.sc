object Demo09{
    /**
      * 递归计算斐波那契数列第n项的值
      * 1 1 2 3 5 8 13 21
      */

    /**
      * --2 3 4 9 8 27 16 81 ...
      * --要求编写递归函数求第n项值
      * --奇数 f(n)=2*f(n-2)
      * --偶数 f(n)=3*f(n-2)
      */
    def f(n:Int):Int={
        if(n==1){
            return 2
        }else if(n==2){
            return 3
        }else if(n%2==0){
            //偶数
            return 3*f(n-2)
        }else if(n%2==1) {
            //奇数
            return 2*f(n-2)
        }else{
            return -1
        }

    }

    f(8)

    //--2 3 4 9 16 81 256
    def f2(n:Int):Int={
        if(n==1){
            return 2
        }else if(n==2){
            return 3
        }else if(n>0){
            return f2(n-2)*f2(n-2)
        }else{
            return -1
        }
    }

    f2(7)

}