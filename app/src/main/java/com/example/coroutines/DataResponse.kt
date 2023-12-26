package com.example.coroutines

data class DataResponse(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)