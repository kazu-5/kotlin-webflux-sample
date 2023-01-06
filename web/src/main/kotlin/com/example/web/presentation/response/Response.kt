package com.example.demo.api.controller.shared.response

class Response<T>(val data: T?): IResponse {
    var statusSuccess = true

    override fun isStatusSuccess(): Boolean {
        return statusSuccess
    }
}