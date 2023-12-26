package com.example.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.google.gson.GsonBuilder
import kotlinx.coroutines.*
import retrofit2.Response
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: DataViewModel
    private val repository = Repository()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        synchronousData()
       //getAllData()
    }

    fun getAllData() {
        CoroutineScope(Dispatchers.Main).launch {
            val oneResponse: Response<DataResponse>?
            val twoResponse: Response<DataResponseTwo>?
            val call1 = async { repository.getDataOne() }
            val call2 = async { repository.getDataTwo() }
            try {
                oneResponse = call1.await()
                twoResponse = call2.await()
                val list = listOf(oneResponse, twoResponse)
                println("data $list")
                showAlertMessage()
                println("All tasks are finished")
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        }
    }

    private fun showAlertMessage() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Tasks Completed")
        builder.setMessage("Both tasks have been completed")
        builder.setPositiveButton("OK", null)
        val dialog = builder.create()
        dialog.show()
    }

    private fun synchronousData() {
        CoroutineScope(Dispatchers.IO).launch {
            val call1 = repository.getDataOne()
            val call2 = repository.getDataTwo()
            println("first data $call1")
            println("second data $call2")
        }
    }
}