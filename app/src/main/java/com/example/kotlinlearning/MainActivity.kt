import com.example.kotlinlearning.Person

fun main(args: Array<String>) {
    println("Hello World")
    println("Hello Kotlin")
    println(10 - 9)
    println(10 / 9)
    println(10.0 / 9)

    var myNumber = 10
    var myDecimal = 1.0
    println(myNumber)
    println(myDecimal)

    var myString: String
    myString = "Hello World"
    myString = "Another World"
    println(myString)

    val myAnotherStr = "My constant string value"
    println(myAnotherStr)

    var personObj = Person("Veena.M")
    personObj.displayName();
}