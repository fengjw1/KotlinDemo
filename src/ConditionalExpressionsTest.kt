fun main(){
    println(maxOf(1, 2))
    println("max of 0 and 42 is ${maxOf(0, 42)}")
    println("min of 0 and 42 is ${minOf(0, 42)}")
}

fun maxOf(a : Int, b : Int): Int{
    if (a > b){
        return a
    }else{
        return b
    }
}

fun minOf(a: Int, b: Int) = if (a > b) b else a