package com.example.kotlinlearning

fun main(args: Array<String>) {

}

abstract class AbstractTest { // you cannot create instance of the abstract class
    open var name: String = "dummy name"
    abstract var address: String

    abstract fun eat() // abstract properties are open by default
    open fun getHeight() {} // a "open" function is ready to be overridden
    fun goToOffice() {} // a normal function is by default public and final
}

class Indian: AbstractTest() {
    override var name:String = "dummy indian name"
    override var address: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun eat() {
        TODO("Not yet implemented")
    }

}