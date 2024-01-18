abstract class Abstraction {
    abstract fun greetings()
}

class Greet : Abstraction(){
    override fun greetings(){
        println("Hello from Greet class")
    }
    companion object {
        // This is the companion object
        const val PI = 3.14

        fun doSomething() {
            println("Doing something in the companion object")
        }
    }
}



