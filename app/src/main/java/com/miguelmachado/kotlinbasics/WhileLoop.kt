package com.miguelmachado.kotlinbasics

fun whileLoop() {
    println("== whileLoop file ==")
    var x = 100

    while (x >= 0) {
        print("$x ")
        x -= 2
    }

    print("\nwhile loop is done")

    var y = 1
    do {
        println("$y ")
        y++
    } while (y <= 10)

    var feltTemp = "cold"
    var roomTemp = 10

    while (feltTemp == "cold") {
        roomTemp++

        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("It's comfy now!")
        }
    }
}