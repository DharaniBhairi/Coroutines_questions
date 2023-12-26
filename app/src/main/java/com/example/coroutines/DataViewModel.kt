package com.example.coroutines

import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import retrofit2.Response

class DataViewModel : ViewModel() {

    private val repository = Repository()

/*        fun getAllData() {
            viewModelScope.launch {
                coroutineScope {
                    val oneResponse: Response<DataResponse>?
                    val twoResponse: Response<DataResponseTwo>?

                    val call1 = async { repository.getDataOne()}
                    val call2 = async { repository.getDataTwo()}

                    try {
                        oneResponse = call1.await()
                        twoResponse = call2.await()

                        val list = listOf(oneResponse,twoResponse)
                        println("data $list")
                        println("All tasks are finished")

                    } catch (ex: Exception) {
                        ex.printStackTrace()
                    }
                }
            }
        }*/
    }