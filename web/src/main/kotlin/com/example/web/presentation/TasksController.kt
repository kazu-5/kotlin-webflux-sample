package com.example.web.presentation

import com.example.demo.api.controller.shared.response.EmptyResponse
import com.example.demo.api.controller.shared.response.IResponse
import com.example.demo.api.controller.shared.response.Response
import com.example.demo.api.controller.shared.response.ValidationResponse
import com.example.core.domain.TaskId
import com.example.core.shared.exception.ValidationException
import com.example.core.usecase.TaskDetailDto
import com.example.core.usecase.TaskDto
import com.example.core.usecase.TaskUseCase
import org.springframework.context.annotation.ComponentScan
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@ComponentScan(basePackages = ["com.example"])
@RestController
@RequestMapping("/tasks")
class TasksController(private val taskUseCase: TaskUseCase) {

    @GetMapping("")
    fun index(): IResponse {
        val tasks:List<TaskDto>? = taskUseCase.list()?.map {
            TaskDto(it.id, it.name)
        }
        tasks?.let{
            return Response<List<TaskDto>>(tasks)
        } ?: return EmptyResponse()
    }

    @GetMapping("/{taskId}")
    fun show(@PathVariable taskId: UUID): IResponse {
        val task = taskUseCase.get(TaskId(taskId))
        task?.let{
            return Response<TaskDetailDto>(TaskDetailDto(task.id!!,task.name.value))
        } ?: return EmptyResponse()
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody body: TaskCreateRequestBody): IResponse {
        val taskId:TaskId = taskUseCase.create(body.name)
        return Response(taskId.value)
    }

    @ExceptionHandler(ValidationException::class)
    fun validation(exception: ValidationException):ValidationResponse {
        return ValidationResponse(exception.validationMessage)
    }
}