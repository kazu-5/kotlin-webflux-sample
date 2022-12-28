package com.example.web.presentation

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest
@AutoConfigureWebTestClient(timeout = "PT10S")
class SampleControllerTest(val client: WebTestClient) {

    @Test
    fun index() {
        client
            .get()
            .uri("/test")
            .exchange()
            .expectStatus().isOk
            .expectBody()
            .json("{\"name\":\"Jane\"}")
    }
}