object Demo06{
    try{
        throw new RuntimeException
    }catch {
        case e : NullPointerException => {
            println("空指针异常")
        }
        case e : Exception => {
            println("其他异常")
        }
    }finally {
        println("end")
    }
}