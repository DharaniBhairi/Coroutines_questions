package com.example.coroutines

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiInstance {
    companion object {

        fun getRetroInstance(): ApiServices {
            return Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/todos/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ApiServices::class.java)
        }
    }
}