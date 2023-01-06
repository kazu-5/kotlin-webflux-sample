package com.example.web.presentation

import com.example.demo.api.controller.shared.response.EmptyResponse
import com.example.demo.api.controller.shared.response.IResponse
import com.example.demo.api.controller.shared.response.Response
import com.example.demo.api.controller.shared.response.ValidationResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

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
    fun show(@PathVariable taskId: Int): IResponse {
        val task = taskUseCase.get(TaskId(taskId))
        task?.let{
            return Response<TaskDetailDto>(TaskDetailDto(task.id!!.value,task.name.value))
        } ?: return EmptyResponse()
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    fun post(@RequestBody body: TaskCreateRequestBody): IResponse {
        val taskId:TaskId = taskUseCase.create(body.name, 1, body.groupId)
        return Response<Int>(taskId.value)
    }

    @ExceptionHandler(ValidationException::class)
    fun validation(req: HttpServletRequest, exception: ValidationException):ValidationResponse {
        return ValidationResponse(exception.validationMessage)
    }
}