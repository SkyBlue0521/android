package com.example.test

class Bird1 {
    //프로퍼티들 - 선언만 함
    var name: String
    var wing: Int
    var beak: String
    var color: String

    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    //메서드들
    fun fly() = println("Fly wing:$wing")
    fun sing(vol: Int) = println("Sing vol:$vol")
    }
    fun main() {
    val coco = Bird1("mybird",2,"short","blue")
        coco.fly()
        coco.sing(3)
    }
