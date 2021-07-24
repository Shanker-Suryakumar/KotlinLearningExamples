fun main(args: Array<String>) {
    val r1 = 1..5 // 1, 2, 3, 4, 5
    println(r1)

    val r2 = 5 downTo 1 // 5, 4, 3, 2, 1
    println(r2)

    val r3 = 5 downTo 1 step 2 // 5, 3, 1
    println(r3)

    val r4 = 'a'..'z' // "a","b",....,"z"
    println(r3)

    var isPresent = 'c' in r4
    println(isPresent)

    var countDown = 10.downTo(1) // 10, 9,...., 1
    println(countDown)

    var moveUp = 1.rangeTo(10) // 1, 2, 3,...., 10
    println(moveUp)
}