import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main program starts : ${Thread.currentThread().name}")

    var job: Job = launch { // Creates a background or worker thread
        for(i in 0..500){
            print("$i.")
//            delay(50)
            yield()
        }
    }

    delay(200)
    job.cancelAndJoin()
    println("Main program ends : ${Thread.currentThread().name}")
}
