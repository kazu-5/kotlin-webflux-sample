package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinWebfluxSampleApplication

fun main(args: Array<String>) {
    runApplication<KotlinWebfluxSampleApplication>(*args)
}
