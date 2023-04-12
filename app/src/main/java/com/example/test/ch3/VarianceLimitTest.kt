package com.example.test.ch3

open class Animal1(val size: Int) {
    fun feed() = println("Feeding...")
}
class Cat1(val jump:Int) : Animal1(50)

class Spider(val poison : Boolean) : Animal1(1)

// 형식 매개변수를 Animal로 제한
class Box<out T:Animal>(val element:T) { // 주 생성자 에서 val만 허용
    fun getAnimal(): T = element // ② out은 반환 자료형에만 사용할 수 있음
    //fun set(new:T) {//오류 ! T는 in 위치에 사용할 수 없음
    // element = new
    // }
}