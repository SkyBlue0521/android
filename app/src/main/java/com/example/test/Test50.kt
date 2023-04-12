package com.example.test

import java.lang.ArithmeticException
import java.lang.Exception

fun main() {
    val a = 6
    val b = 0
    val c: Int

    try {
        c = a / b //0으로 나눔
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("finally 블록은 반드시 항상 실행됨")
    }
    
}

//보안으로 사용하지 말것.