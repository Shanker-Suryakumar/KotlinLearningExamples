import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Main program starts : ${Thread.currentThread().name}")

    var job: Job = launch(Dispatchers.Default) { // Creates a background or worker thread
        for(i in 0..500){
            if(!isActive) {
                return@launch
//                break
            }
            print("$i.")
            Thread.sleep(1)
        }
    }

    delay(200)
    job.cancelAndJoin()
    println("Main program ends : ${Thread.currentThread().name}")
}
