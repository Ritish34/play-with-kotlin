
open class Inheritance{
    open fun printHello(){
        println("Hello")
    }
    fun printHello(abc: Any){
        println("Hello $abc")
    }
}

class MyView : Inheritance() {
    override fun printHello(){
        println("Hello from override method")
    }
}

class Rectangle(val width: Int, val height: Int) {
    var creater: String = ""
        set(value) {
            field = value.uppercase()
        }

    val area: Int
        get() = this.width * this.height
}
fun interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}
class Box<T>(t: T) {
    var value = t
}

fun main(args: Array<String>) {
//    val obj = D()
//    println(obj.bar())
//    var list: MutableList<Int> = mutableListOf(1, 2, 3)
//    println(list)
//    list.swap(1, 2)
//    println(list)
//open class Shape
//    class Rectangle: Shape()
//
//    fun Shape.getName() = "Shape"
//    fun Rectangle.getName() = "Rectangle"
//
//    fun printClassName(s: Shape) {
//        println(s.getName())
//    }
//
//    printClassName(Rectangle())

    var a = Box<Int>(1)
    println("${a.value}, ${a.value.javaClass}")
}