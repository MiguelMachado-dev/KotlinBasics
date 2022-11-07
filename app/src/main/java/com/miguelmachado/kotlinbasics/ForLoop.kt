package com.miguelmachado.kotlinbasics

fun forLoop() {
    for (num in 1..10) {
        print("$num")
    }
    println("-------")
    for (i in 1 until 10) {
        print("$i")
    }
    println("-------")
    for (i in 10 downTo 1 step 2) {
        print("$i")
    }
}