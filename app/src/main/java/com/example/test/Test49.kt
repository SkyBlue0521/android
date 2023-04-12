package com.example.test

import java.lang.ArithmeticException
import java.lang.Exception

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b //0으로 나눔
    } catch (e: ArithmeticException) {
        println("Exception is handled.${e.message}")
    }
}


