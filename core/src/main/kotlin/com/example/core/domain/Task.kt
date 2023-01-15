package com.example.core.domain

import java.util.*

data class Task(val id: TaskId?, val name: TaskName) {

    companion object {
        fun create(name: String): Task {
            return Task(TaskId(UUID.randomUUID()), TaskName(name))
        }
    }
}

data class TaskId(val value: UUID)

data class TaskName(val value: String)