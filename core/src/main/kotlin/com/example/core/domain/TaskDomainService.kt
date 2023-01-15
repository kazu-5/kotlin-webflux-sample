package com.example.core.domain

import org.springframework.stereotype.Service

@Service
class TaskDomainService(
    private val taskRepository: ITaskRepository,
) {
    fun create(name: String): TaskId {
        val task = Task(null, TaskName(name))
        return taskRepository.create(task).id!!
    }
}