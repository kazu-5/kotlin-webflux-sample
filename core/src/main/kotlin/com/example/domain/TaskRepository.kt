package com.example.domain

interface TaskRepository {
    fun findAll(): List<Task>?

    fun find(id: TaskId): Task

    fun save(task: Task): TaskId
}