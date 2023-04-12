package com.example.test

fun main() {
    val num = 256

    if(num is Int) {
        print(num)
    } else if(num !is Int) { //num이 Int형이 아닐 떄, !(num is Int)와 동일
        print("Not a Int")
    }
  }