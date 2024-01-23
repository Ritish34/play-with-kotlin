package functions

import java.util.Locale

typealias param = (Int, String) -> String
fun String.capitalizeFirstLetter(): String {
    return this.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}

fun main(){
    var myVar = {a:Int, b:String -> "$a + $b"}
    println(myVar(1, "A"))

    var myVar2: param = {a, b -> "$a + $b"}
    println(myVar2(1, "A"))

    var myVar3: param = {a:Int, b:String -> "$a + $b"}
    println(myVar3(1, "A"))

    println( {a: String, b: String -> "$a $b"} ("Hüseyin", "Özkoç") )

    // Using String.(Int) -> String
    val repeatFun: String.(Int) -> String = { times ->
        this.repeat(times)
    }

    val result1 = "Hello, ".repeatFun(3)  // Calls the extension function on a String
    println(result1)  // Output: Hello, Hello, Hello,

// Using (String, Int) -> String
    val repeatFun2: (String, Int) -> String = { str, times ->
        str.repeat(times)
    }

    val result2 = repeatFun2("Hi, ", 2)  // Calls the regular function with explicit parameters
    println(result2)  // Output: Hi, Hi,

    val repeatFun1: String.(Int) -> String = { times -> this.repeat(times) }
    val twoParameters: (String, Int) -> String = repeatFun1

    println(twoParameters("second word, ".capitalizeFirstLetter(),3))

    /**
     * extension functions can be used as regular functions
     * regular functions can't be used as extension functions
     *
     * in below example 'stringPlus' is regular function and 'intPlus' is extension function
     * */

    val stringPlus: (String, String) -> String = String::plus
    val intPlus: Int.(Int) -> Int = Int::plus

    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))
//    println("Hello, ".stringPlus("world!"))  //can't use like this

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(2.intPlus(3)) // extension-like call

    html {       // lambda with receiver begins here
        body()   // calling a method on the receiver object
    }

    html {       // lambda with receiver begins here
        body()   // calling a method on the receiver object
    }
    html {       // lambda with receiver begins here
        body()   // calling a method on the receiver object
    }

}

//class HTML {
//    fun body() {
//        print("hello from html body")
//        println(this)
//    }
//}

class HTML {
    companion object {
        /**
         * singleton object creation
         * */
        private val obj: HTML by lazy {
            HTML()
        }

        /**
         * method name can't be getObj because it's same as JVM's auto generated getter method name
         * */
        fun getObject(): HTML {
            return obj
        }
    }

    fun body() {
        println("Adding body to HTML")
        println(this)
    }
}

//fun html(init: HTML.() -> Unit): HTML {
//    val html = HTML()  // create the receiver object
//    html.init()        // pass the receiver object to the lambda
//    println(html)
//    return html
//}
fun html(init: HTML.() -> Unit): HTML {
    val html = HTML.getObject()
    html.init()
    return html
}

