package com.example.test

fun main() {
    print("Enter the score:50.5")
    var score=readLine()!!.toDouble()
    var grade:Char='F'

    //인수 없는 when의 사용

    when {
        score >= 90.0 -> grade = 'A' //인자 있는 whem과 다르게 조건식을 구성함
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        score < 70.0 -> grade = 'F'
    }
    println("Score:$score,Grade:$grade")
    }