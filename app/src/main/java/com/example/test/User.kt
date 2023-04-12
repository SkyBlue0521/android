package com.example.test

import java.text.SimpleDateFormat
import java.util.*

var data = 10

fun formatData(date:Date):String {
    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd")
    return simpleDateFormat.format(date)
}

class User {
    var name="hello"

    fun sayHello() {
        println("name:$name")
    }
}

