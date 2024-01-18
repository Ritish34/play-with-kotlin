// Basic Example
//fun main() {
//    println("Hello World!")
//}

// read using args and use elvish operator
fun main(args: Array<String>) {
    println("What is your name?")
//    val input: String? = args[0]
    val input: String? = readlnOrNull()
    val abc: String = if (input.isNullOrBlank()) try { ThrowError() } catch (e: Exception){ println("error ${e.message}") }.toString() else input
//    println("Hello ${abc.trim().uppercase()}")
    val obj = Person(abc.trim().uppercase(), 10)
    obj.printName().also(::println)
    val g = Greet();
    g.greetings()
    Greet.PI.also (::println)
}

fun ThrowError() {
    throw Exception("Hi There!!")
}

class Person(private var name: String){
    var age1 = 0;
    constructor(name: String, age: Number) : this(name) {
        age1 = age as Int
    }
    fun printName(): String{
        return "Hello $name, age = $age1"
    }
}

