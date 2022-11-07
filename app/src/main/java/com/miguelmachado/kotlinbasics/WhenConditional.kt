package com.miguelmachado.kotlinbasics

fun whenConditional() {
    println("== whenConditional file ==")
    var season = 3

    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    var month = 3

    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }

    var x: Any = 13.37
    when (x) {
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x is non of the above")
    }
}