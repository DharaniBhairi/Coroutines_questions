package com.example.coroutines

import retrofit2.Response

class Repository {

    private val instance = ApiInstance.getRetroInstance()

    suspend fun getDataOne(): Response<DataResponse> {
        return instance.get()
    }

    suspend fun getDataTwo() : Response<DataResponseTwo>{
        return instance.get2()
    }

}