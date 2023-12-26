package com.example.coroutines

import kotlin.system.measureTimeMillis

fun main(){

    Thread {
        val time = measureTimeMillis {
            val one = sampleOne()
            val two = sampleTwo()
            println("The answer is ${one + two}")
        }
        println("Completed in $time ms")
    }.start()
    println("EOF")
}

private  fun sampleOne(): Int {
    println( "sampleOne"+System.currentTimeMillis())
    Thread.sleep(1000L) // pretend we are doing something useful here
    return 10
}

private  fun sampleTwo(): Int {
    println( "sampleTwo"+System.currentTimeMillis())
    Thread.sleep(5000L) // pretend we are doing something useful here, too
    return 10
}