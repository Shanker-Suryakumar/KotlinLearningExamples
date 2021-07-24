package com.example.kotlinlearning

fun main(args: Array<String>) {
    var objButton = MyButton()
    objButton.onClick()
    objButton.onTouch()

    var objButtonTwo = MyButtonTwo()
    objButtonTwo.onClick()
    objButtonTwo.onTouch()
}

interface InterfaceTest { // you cannot create instance of the interface
    var name: String // properties in interface are abstract by default

    fun onTouch() // methods in interface are abstract by default

    fun onClick() { // normal methods in interface are public and open by default NOT FINAL
        println("Button was clicked from InterfaceTest")
    }
}

class MyButton: InterfaceTest {
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun onTouch() {
        println("Button was touched")
    }

    // implementation provided class are optional to override
//    override fun onClick() {
//        super.onClick()
//        println("Button was clicked from mybutton")
//    }
}

interface InterfaceTwo { // you cannot create instance of the interface
    fun onTouch() // methods in interface are abstract by default

    fun onClick() { // normal methods in interface are public and open by default NOT FINAL
        println("Button was clicked from InterfaceTwo")
    }
}

class MyButtonTwo: InterfaceTest, InterfaceTwo {
    override var name: String
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun onTouch() {
        println("ButtonTwo was touched from MyText")
    }

    override fun onClick() {
        super<InterfaceTest>.onClick()
        super<InterfaceTwo>.onClick()
        println("ButtonTwo was clicked from MyButtonTwo")
    }
}