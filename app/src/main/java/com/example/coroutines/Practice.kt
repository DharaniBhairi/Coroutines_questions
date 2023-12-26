package com.example.coroutines

//even and sum
/*
fun main(){
    val list = listOf(4,7,10,9,1,6,13)
    val result = list.filter{i -> i%2 == 0}
    println(result)
    val sum = result.reduce {s,element -> s+element}
    println(sum)
}*/

/*
//average length of strings
fun main(){
    val list = listOf("hi","hello","worlds","all","mobile")
    val result = list.map {
     it.length
    }.average()
    println(result)
}*/

//grouping people by their age
fun main(){
    val list = listOf(
        Response("Dharani",22),
        Response("harani",27),
        Response("arani",20),
        Response("rani",3),
        Response("ani",18),
        Response("ni",7),
        Response("i",16)
    )
    val result = list.groupBy{
        it.name
        println(it)
    }
    println(result)
}