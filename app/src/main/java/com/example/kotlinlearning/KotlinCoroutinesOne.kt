import com.example.kotlinlearning.BuildConfig
import kotlinx.coroutines.*

fun main() { // Executes in main thread
    println("Main program starts : ${Thread.currentThread().name}")

    GlobalScope.launch { // Creates a background or worker thread
        println("Fake work starts : ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Fake work finished : ${Thread.currentThread().name}")
    }
if(BuildConfig.DEBUG){

}
    println("Main program ends : ${Thread.currentThread().name}")
}