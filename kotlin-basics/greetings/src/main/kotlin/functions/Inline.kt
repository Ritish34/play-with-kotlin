package functions

/**
 * inline function can copy from one to other
 *
 * in example second function code is copy paste in first function
 * */

fun main(){
    firstFunc()
}

fun firstFunc(){

    println("Hello Android Developers!")
    secondFunc()
}

fun secondFunc(){
    println("Write with love!")
}