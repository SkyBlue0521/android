package com.example.test

fun main() {
    print("Enter th lines:")
    val n = readLine()!!.toInt()
    //콘솔로부터 입력받음 .

    for(line in 1..n) {
        for(space in 1..(n-line)) print(" ") //공백출력
            for(star in 1..(2* line-1)) print("*") //별표 출력
        println()//개행
    }
}