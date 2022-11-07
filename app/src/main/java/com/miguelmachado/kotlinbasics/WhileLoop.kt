package com.miguelmachado.kotlinbasics

fun whileLoop() {
    println("== whileLoop file ==")
    var x = 100

    while (x >= 0) {
        print("$x ")
        x -= 2
    }

    print("\nwhile loop is done")
}