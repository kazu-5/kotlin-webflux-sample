package com.example.demo.api.controller.shared.response

class EmptyResponse : IResponse {
    override fun isStatusSuccess(): Boolean {
        return true
    }
}