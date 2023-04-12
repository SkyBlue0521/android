package com.example.test

fun main() {

    print("Enter the score:")
    var score= readLine()!!.toInt()
    var grade:String ="사원"

    when{
        score>=600 -> grade ="부장"
        score in 500..599 -> grade = "차장"
        score in 400..499 -> grade = "과장"
        score in 200..399 -> grade = "대리"
        score <200 -> grade = "사원"
    }
    println("Score:$score,Grade:$grade")

}