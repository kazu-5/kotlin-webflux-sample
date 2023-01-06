package com.example.web.presentation

data class TaskCreateRequestBody(
    var name: String,
    var groupId: Int) {
}