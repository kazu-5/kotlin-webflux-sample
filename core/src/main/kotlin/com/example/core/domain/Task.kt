package com.example.core.domain

import java.util.*

data class Task(val id: TaskId?, val name: TaskName) {
}

data class TaskId(val value: UUID)

data class TaskName(val value: String)