package com.example.demo.controller

import com.example.demo.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service: MessageService) {
    @GetMapping("/")
    fun index(@RequestParam(name = "name") name: String?) = "Hello, ${name ?: "Ritish"}!"

    @GetMapping("/message")
    fun message() = listOf(
            Message("1","did you watch anime?"),
            Message("2","watch naruto")
    )

    @GetMapping("/get")
    fun index(): List<Message> = service.findMessages()

    @GetMapping("/{id}")
    fun index(@PathVariable id: String): List<Message> =
            service.findMessageById(id)

    @PostMapping("/save")
    fun post(@RequestBody message: Message) {
        service.save(message)
    }
}

data class Message(val id: String?, val text: String)