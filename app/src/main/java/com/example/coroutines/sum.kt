package com.example.coroutines

fun main(){
    val array = intArrayOf(2,7,4,8,5,9,0,6)

    val result = sum(array,1,5)
    println("sum is $result")
}

fun sum (arr : IntArray,startIndex : Int, endIndex : Int): Int {
    var sum =0
    for (i in startIndex..endIndex){
        sum += arr[i]
    }
    return sum
}