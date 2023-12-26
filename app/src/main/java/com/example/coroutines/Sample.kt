package com.example.coroutines

/*fun main() {
    val numbers = listOf(5, 2, 10, 4)

    val simpleSum = numbers.reduceRight{ sum, element -> sum + element }
    println(simpleSum)
    val sumDoubled = numbers.fold(0) { sum, element -> sum + element * 2 }
    println(sumDoubled)*/

/*    fun main(args: Array<String>) {
        val dates = mutableListOf(
            Date(2023, 4, 3),
            Date(2021, 5, 16),
            Date(2018, 5, 16),
            Date(2021, 1, 29)
        )
        dates.sortBy { it.year }
        dates.sortByDescending { it.year }
       val sort =  dates.sortedBy { it.year }
        sort.forEach { println(it) }
        println("--- ASC ---")
        dates.forEach { println(it) }

        dates.sortWith(compareBy<Date>{it.year}.thenBy { it.month }.thenBy { it.day })
        dates.forEach { println(it) }

    }*/

fun main(){
//    val list = listOf(1,3,7,4,5,8,11,6)
//    val result = list.filter {i->i%2 == 0}
//    println(result)

    val words = listOf("bezkoder", "zkoder", "kotlin", "programmingz", "ezcoder", "professional", "zcoder")

    val byLength = words.groupBy { it.length }

//    println(byLength)
//// {8=[bezkoder, bezcoder], 6=[zkoder, kotlin, zcoder], 12=[programmingz, professional]}
//
//    println(byLength.keys)
//// [8, 6, 12]
//
//    println(byLength.values)
// [[bezkoder, bezcoder], [zkoder, kotlin, zcoder], [programmingz, professional]]
    val result = words.groupingBy{ it.first()}.eachCount()
    println(result)
}