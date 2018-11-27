class Person {
    //--定义在类内部的方法，称为成员方法
    def cook()={
        println("cook food")

        //定义在函数内部的函数，称为本地函数
        def eat()={
            println("eat food")
        }
    }
}
