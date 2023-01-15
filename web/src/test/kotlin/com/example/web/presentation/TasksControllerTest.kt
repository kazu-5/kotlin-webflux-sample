package com.example.web.presentation

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.test.web.reactive.server.body
import reactor.core.publisher.Mono

@SpringBootTest
@AutoConfigureWebTestClient
class TasksControllerTest @Autowired constructor(val client: WebTestClient) {

    @Test
    fun create() {
        client
            .post()
            .uri("/tasks")
            .body(
                Mono.just(
                    TaskCreateRequestBody("xxxxx",1)
                )
            )
            .exchange()
            .expectStatus().isCreated
    }
}