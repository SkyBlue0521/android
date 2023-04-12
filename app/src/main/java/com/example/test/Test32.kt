package com.example.test

fun main() {
    var sum = 0
    for(i in 1..10) {
        if(i%2==1)
        sum += i
    }
    println(sum)
}
//홀수누적합계 합