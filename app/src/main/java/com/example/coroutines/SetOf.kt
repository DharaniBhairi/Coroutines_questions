package com.example.coroutines

fun main(args: Array<String>)
{
    //declaring a set of strings
    val seta = setOf("Geeks" , "for", "Geeks")
    //declaring a set of characters
    val setb = setOf( "G" , "f" , "g" )
    //declaring a set of integers
    val setc = setOf( 1 ,2 , 3 , 4 )

    //traversing through a set of strings
    for(item in seta)
        print( item )
    println()
    //traversing through a set of characters
    for(item in setb)
        print( item )
    println()
    //traversing through a set of integers
    for(item in setc)
        print( "$item ")
}
