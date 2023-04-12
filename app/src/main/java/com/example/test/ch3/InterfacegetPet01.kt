package com.example.test.ch3

interface Pet01 {
    var category:String
    val msgTags:String // val 선언 시 게터의 구현이 가능
    get()="I'm your lovely pet!"

    fun feeding()
    fun patting() {
        println("Keep patting")
    }
}
