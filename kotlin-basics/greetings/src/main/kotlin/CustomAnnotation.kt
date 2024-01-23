
/**
 * Annotation is used to store metaData
 * This is only store metaData not process this data
 * */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Custom(val str: String)

@Custom("hello from abc!!")
class MyClass{
    fun printHello(){
        println("Hello")
    }
}

var xxx = 1
/**
 * here we have use kotlin Reflection to find annotation parameter value
 * */
fun main(){
    val annotation = MyClass::class.annotations.find { it is Custom } as Custom
    println(annotation.str)
    println(::xxx.name)
    println(::xxx.get())
    ::xxx.set(123)
    println(::xxx.get())
}