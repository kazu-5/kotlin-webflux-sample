package com.example.core.usecase

import com.example.core.domain.Task
import com.example.core.domain.TaskDomainService
import com.example.core.domain.TaskId
import org.springframework.stereotype.Component

@Component
class TaskUseCase(
    private val taskRepository: TaskRepository,
    private val taskDomainService: TaskDomainService
) {
    fun list(): List<TaskDto>? {
        return taskRepository.findAll()?.map { TaskDto(it.id!!.value, it.name.value) }
    }

    fun get(id: TaskId): Task? {
        return taskRepository.find(id)
    }

    fun create(name: String, userId: Int, groupId: Int): TaskId {
        return taskDomainService.create(name, userId, groupId)
    }
}