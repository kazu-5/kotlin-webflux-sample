package com.example.presentation

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class SampleController {

    @GetMapping("")
    fun index() {
        println("test123")
        return
    }
}