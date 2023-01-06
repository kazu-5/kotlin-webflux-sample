package com.example.domain

interface UserRepository {
    fun isJoin(user_id: Int, groupId: Int): Boolean
}