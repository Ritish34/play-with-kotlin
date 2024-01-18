/**
 *
 * */

interface Base {
    fun print()
    fun greet()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { println(x) }
    override fun greet() {
        println("Hello From BaseImpl")
    }
}

class BaseImpl2(private val x: String) : Base {
    override fun print() { println(x) }
    override fun greet() {
        println("Hello From BaseImpl2")
    }
}

class Derived(b: Base) : Base by b{
//    override fun greet() {
//        println("Hello from Derived Class")
//    }
}

fun main() {
    val b1 = BaseImpl(10)
    println("method prints using BaseImpl class object")
    Derived(b1).print()
    Derived(b1).greet()

    println()

    val b2 = BaseImpl2("Ritish Parmar")
    println("method prints using BaseImpl class object")
    Derived(b2).print()
    Derived(b2).greet()
}