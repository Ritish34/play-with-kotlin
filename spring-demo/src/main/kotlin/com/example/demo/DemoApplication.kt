package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

//fun main(args : Array<String>) {
//	print("Enter text: ")
//	var input = readlnOrNull()
//	print("You entered: $input")
//}
