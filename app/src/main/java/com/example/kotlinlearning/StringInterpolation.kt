fun main(args: Array<String>) {
    var name: String = "Veena.M"
    val str = "Hello $name"
    println(str)
    println("The statement is $str. The number of characters in statement is $str.length")
    println("The statement is $str. The number of characters in statement is ${str.length}")

    val a = 32
    val b = 27
    println("The sum of $a and $b is ${a+b}")
}