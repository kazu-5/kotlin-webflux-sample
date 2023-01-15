package com.example.core.usecase

import com.example.core.domain.Task
import com.example.core.domain.TaskDomainService
import com.example.core.domain.TaskId
import com.example.core.domain.TaskName
import com.example.core.impl.TaskRepository
import org.springframework.stereotype.Component

@Component
class TaskUseCase(
    private val taskRepository: TaskRepository,
) {
    fun list(): List<TaskDto>? {
        return taskRepository.findAll()?.map { TaskDto(it.id!!, it.name.value) }
    }

    fun get(id: TaskId): Task? {
        return taskRepository.find(id)
    }

    fun create(name: String): TaskId {
        val task = Task.create(name)
        return taskRepository.create(task).id!!
    }
}