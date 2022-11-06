package com.miguelmachado.kotlinbasics

fun main() {
    val myName = "Miguel"
    var myAge = 23
    myAge += 1
    print("Hello $myName, I am $myAge years old")

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
}
