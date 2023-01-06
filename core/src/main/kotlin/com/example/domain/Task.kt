package com.example.domain

data class Task(val id: TaskId?, val name: TaskName, val userId:Int, val groupId:Int) {
}

data class TaskId(val value: Int)

data class TaskName(val value: String)