fun main(args: Array<String>) {
    var largeValue = max(32, 27)
    println("The greater number is $largeValue")

    var largestOfTwo = maxOfTwo(27, 32)
    println("The largest of two number is $largestOfTwo")
}

// Function acting as expression
fun max(a: Int, b: Int): Int = if (a > b) a else b

fun maxOfTwo(a: Int, b: Int): Int = if (a > b) {
    println("$a is greater")
    a
} else {
    println("$a is greater")
    b
    99 // always last value will be returned
}