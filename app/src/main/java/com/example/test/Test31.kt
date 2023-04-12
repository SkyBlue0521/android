package com.example.test

fun main() {
    var sum:Int = 0
    for(i in 1..10) {
        if (i%2==0)
            sum+=i
    }
    println(sum)
}
//짝수 누적합계 합