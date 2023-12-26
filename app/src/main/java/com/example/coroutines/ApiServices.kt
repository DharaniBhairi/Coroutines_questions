package com.example.coroutines

import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {

    @GET("1")
    suspend fun get() : Response<DataResponse>

    @GET("2")
    suspend fun get2() : Response<DataResponseTwo>
}