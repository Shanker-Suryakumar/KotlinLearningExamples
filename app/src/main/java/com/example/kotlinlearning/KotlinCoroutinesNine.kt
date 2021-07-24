import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main program starts : ${Thread.currentThread().name}")

    var job = async { // Creates a background or worker thread
        println("Fake work starts : ${Thread.currentThread().name}")
        mySuspendFunc(1000)
        println("Fake work finished : ${Thread.currentThread().name}")
    }

    job.join()
    println("Main program ends : ${Thread.currentThread().name}")
}
