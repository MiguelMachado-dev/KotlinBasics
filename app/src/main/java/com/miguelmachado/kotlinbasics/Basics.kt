package com.miguelmachado.kotlinbasics

fun main() {
    val myName = "Miguel"
    var myAge = 23
    myAge += 1
    println("Hello $myName, I am $myAge years old")

    /*
     Integer Types:
     Byte - 8 bit
     Short - 16 bit
     Int - 32 bit
     Long - 64 bit
    */
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 1231231231
    val myLong: Long = 12_039_812_309_487_120_39

    /*
       Floating Point number types:
       Float - 32 bit
       Double - 64 bit
     */
    val myFloat: Float = 13.37F // F in the end explicitly stating that it should be a float
    val myDouble: Double = 3.14159265359

    /*
    * Booleans are used to represent logical values. It can have two possible values
    * true and false
    * */
    var isSunny: Boolean = true
    isSunny = false

    // Characters
    val letterChar: Char = 'A'
    val digitChar: Char = '1'

    // String
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]

    // Arithmetic operators
    var result = 5 + 3
    val a = 5.0
    val b = 3
    var resultDouble: Double = a / b
    // var resultParsed = (a / b).toInt()
    println(resultDouble)

    // Comparison operators ( ==, !=, <, >, <=, >=)
    val isEqual = result == b
    val isNotEqual = result != b

    val conditionals = Conditionals()
    conditionals.runConditional()
    whenConditional()

    whileLoop()
}
