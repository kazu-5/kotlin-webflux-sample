package com.example.demo.api.controller.shared.response

class ValidationResponse(val validationMessage:String): IResponse {
    var statusSuccess = true

    override fun isStatusSuccess(): Boolean {
        return statusSuccess
    }
}