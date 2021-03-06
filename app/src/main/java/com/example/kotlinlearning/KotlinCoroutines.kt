import kotlin.concurrent.thread

fun main() { // Executes in main thread
    println("Main program starts : ${Thread.currentThread().name}")

    thread { // Creates a background or worker thread
        println("Fake work starts : ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Fake work finished : ${Thread.currentThread().name}")
    }

    println("Main program ends : ${Thread.currentThread().name}")
}