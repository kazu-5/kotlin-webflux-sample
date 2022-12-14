package com.example.usecase

import com.example.domain.Task
import com.example.domain.TaskDomainService
import com.example.domain.TaskId
import com.example.domain.TaskRepository
import org.springframework.stereotype.Service

@Service
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