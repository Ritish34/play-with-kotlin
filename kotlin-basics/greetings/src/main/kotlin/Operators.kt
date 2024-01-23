class MyNumber(val value: Int) {
    // Overloading binary arithmetic operators
    operator fun plus(other: MyNumber): MyNumber {
        return MyNumber(value + other.value)
    }

    operator fun minus(other: MyNumber): MyNumber {
        return MyNumber(value - other.value)
    }

    operator fun times(other: MyNumber): MyNumber {
        return MyNumber(value * other.value)
    }

    operator fun div(other: MyNumber): MyNumber {
        return MyNumber(value / other.value)
    }

    operator fun rem(other: MyNumber): MyNumber {
        return MyNumber(value % other.value)
    }

    // Overloading comparison operators
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MyNumber) return false
        return value == other.value
    }
}

fun main() {
    val num1 = MyNumber(10)
    val num2 = MyNumber(5)

    // Using overloaded operators
    val sum = num1 + num2
    val difference = num1 - num2
    val product = num1 * num2
    val quotient = num1 / num2
    val remainder = num1 % num2

    val isEqual = num1 == num2

    println("Sum: ${sum.value}")
    println("Difference: ${difference.value}")
    println("Product: ${product.value}")
    println("Quotient: ${quotient.value}")
    println("Remainder: ${remainder.value}")

    println("Equal: $isEqual")
}
