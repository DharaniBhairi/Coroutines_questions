package com.example.coroutines

fun main() {
    val array1 = arrayOf(1, 4, 6, 3, 9, 11, 5)
    val array2 = arrayOf(2, 9, 14, 4, 8, 11, 6)
    val array3 = arrayOf(8, 5, 4, 19, 13, 7, 11)
    val result = common(array1,array2,array3)
    println(result)
}

fun common(arr1:Array<Int>,arr2 : Array<Int>,arr3 :Array<Int>): MutableList<Int> {
    val commonElements : MutableList<Int> = mutableListOf()
    arr1.forEach {
        if (arr2.contains(it)&&arr3.contains(it))
            commonElements.add(it)
    }
    return commonElements
}