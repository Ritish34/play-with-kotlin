package functions

fun foo(vararg strings: String){
    println(strings.forEach { println(it) })
}

fun asPositiveList(vararg nums: Number){
    println(nums.iterator().forEachRemaining{
        if (it.toDouble() >= 0) {
            println(it)
        }
    })
}

fun main(){
    foo("1","2","3","Ritish")
    val a = intArrayOf(1, 2, 3) // IntArray is a primitive type array
    val list = asPositiveList(-1, 0, *a.toTypedArray(), 4)
}