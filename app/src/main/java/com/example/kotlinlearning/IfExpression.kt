import com.example.kotlinlearning.Person

fun main(args: Array<String>) {
    val a = 32
    val b = 27

    // returns value if single line without braces
    var maxValue: Int = if (a > b)
        a
    else
        b
    println(maxValue)

    var maxValues: Int = if (a > b) {
        println("a is greater")
        a
    } else {
        println("b is greater")
        b
    }
    println(maxValues)
}