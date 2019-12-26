//单行注释

/*
嵌套注释

/*
多行注释
 */

*/

val a: Int = 1
val b = 2

val PI = 3.14
var x = 0

fun main(){
    println(sum(1, 2))
    println(sum1(1, 2))
    println(printSum(1, 2))

    val c: Int
    c = 3

    println("a=$a b=$b c=$c")

    var x = 5
    x += 1
    println("x = $x")

    println(incrementX())
}

fun incrementX(): Int{
    x += 1
    return x
}

fun sum(a: Int, b: Int) : Int{
    return a + b
}

fun sum1(a: Int, b: Int) = a + b//简写

fun printSum(a: Int, b: Int): Unit{
    println("sum of $a and $b is ${a + b}")
}