@file:JvmName("MyCustomKotlinFileName")

package com.example.kotlinlearning

fun main(args: Array<String>) {
    var area = InteroperabilityJava.getArea(32, 27)
    println("Printing area from Kotlin file $area")
}

fun add(a: Int, b: Int): Int {
    return a + b
}
