package com.example.test.ch3

interface Pet2 {
    var category : String
    val msgTags : String // val 선언 시 게터의 구현이 가능
    get() = "I'm your lovely pet!"
    fun feeding()
    fun patting() {
        println("keep patting!")
    }
}
open class Animal(val name:String)

class Dog(name:String,override var category:String) : Animal(name),Pet {
    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Cat7(name:String,override var category: String) : Animal(name),Pet {
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

class Master {
    fun playWithPet(dog: Dog) { // ② 각 애완동물 종류에 따라 오버로딩됨
        println("Enjoy with my dog.")
    }
    fun playWithPet(cat: Cat7) { // ③ 고양이를 위한 메서드
        println("Enjoy with my cat.")
    } }
fun main() {
    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat7("Coco", "BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat) }