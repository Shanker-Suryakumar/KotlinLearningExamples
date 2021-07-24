package com.example.kotlinlearning

fun main(args: Array<String>) {
    val x = 5
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> {
            println("x value is unknown")
        }
    }

    val y = 11
    when (y) {
        in 1..20 -> println("y lies in 1 to 20")
        2 -> println("y is 2")
        else -> {
            println("y value is unknown")
        }
    }

    val z = 11
    when (z) {
        !in 1..20 -> println("z lies in 1 to 20")
        2 -> println("z is 2")
        else -> {
            println("z value is unknown")
        }
    }

    var str: String
    when (x) {
        1 -> str = "x is 1"
        2 -> str = "x is 2"
        else -> str = "x value is unknown"
    }
    println(str)

    var str1: String = when (x) {
        1 -> "x is 1"
        2 -> "x is 2"
        else -> "x value is unknown"
    }
    println(str1)

    val a = 100
    var str2: String = when (a) {
        1 -> "a is 1"
        2 -> "a is 2"
        else -> {
            "a value is unknown" // the expression is unused
            "a is an alien"
        }
    }
    println(str2)
}
