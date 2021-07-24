import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main program starts : ${Thread.currentThread().name}")

    var job: Job = launch { // Creates a background or worker thread
        for(i in 0..500){
            print("$i.")
            Thread.sleep(50)
        }
    }

    // Wont cancel the coroutines
    delay(200)
    job.cancel()
    job.join()
    println("Main program ends : ${Thread.currentThread().name}")
}
