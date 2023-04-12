package com.example.test

fun main() {
    var data = 10
    val result = if(data>0) {
        print("data>0")
        true //참
    } else {
        println("data<=0")
        false //거짓
    }
    println(result)
}