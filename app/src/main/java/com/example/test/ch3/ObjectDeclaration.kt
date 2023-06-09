package com.example.test.ch3

//(1)obj 키워드를 사용한 방식
object OCustomer {
    var name = "Kildong"
    fun greeting() = println("Hello World!")
    val HOBBY = Hobby("Basketball")
    init {
        println("Init!")
    }
}

class Hobby(val name:String)
fun main() {
    OCustomer.greeting() // 객체의 접근 시점
    OCustomer.name="Dooly"
    println("name=${OCustomer.name}")
    println(OCustomer.HOBBY.name)
}