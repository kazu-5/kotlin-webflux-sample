package com.example.core.domain

interface ITaskRepository {
    fun findAll(): List<Task>?

    fun find(id: TaskId): Task

    fun create(task: Task): Task

    fun update(task: Task): Task
}