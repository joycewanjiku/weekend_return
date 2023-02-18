fun main(){
  println( addition(53,42))
   println (module(92,42))
    println(subtraction(63,31))
    println(division(88,44))

}

fun addition(add1:Int, add2:Int):Int{
    var add =add1+add2
     return add

}
fun module(mod1:Int,mod2:Int):Int{
    var mod =mod1%mod2
    return mod
}
fun subtraction(sub1:Int,sub2:Int):Int{
    var sub =sub1-sub2
    return sub
}fun division(div1:Int,div2:Int):Int{
    var div =div1/div2
    return div
}


