package functions

data class Point(val x: Int, val y: Int){
    operator fun inc() = Point(x + 1, y + 1)
}

operator fun Point.unaryMinus() = Point(-x, -y)

var point = Point(10, 20)

fun abc(a : String?): Any? {
    when(a){
        "int" -> return 1
        "string" -> return "String"
        "" -> return null
    }
    return null
}

fun main() {
    println(-point) // prints "Point(x=-10, y=-20)"
    println(++point)
    println(point++)
    println(point)
    val a1 = abc("int")
    val a2 = abc("string")
    val a3 = abc(null)
        println("${a1?.javaClass} --- ${a2?.javaClass} --- ${a3?.javaClass} ---  ")
    println()
}