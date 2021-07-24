import kotlinx.coroutines.*

fun main() { // Executes in main thread
    println("Main program starts : ${Thread.currentThread().name}")

    GlobalScope.launch { // Creates a background or worker thread
        println("Fake work starts : ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Fake work finished : ${Thread.currentThread().name}")
    }

    // without this waiting time of 2000 the fake work will not be visible
    Thread.sleep(2000) // Will wait for coroutine to finish its task
    println("Main program ends : ${Thread.currentThread().name}")
}