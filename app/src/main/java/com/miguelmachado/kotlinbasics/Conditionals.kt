package com.miguelmachado.kotlinbasics

class Conditionals {
    private val age = 17

    fun runConditional() {
        if (age >= 21) {
            println("Now you may drink in the US")
        } else if (age >= 18) {
            println("You may vote now!")
        } else if (age >= 16) {
            println("You may drive now!")
        } else {
            println("You are too young.")
        }
    }
}