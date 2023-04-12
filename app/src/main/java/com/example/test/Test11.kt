package com.example.test

fun main() {
    var x = 4
    var y = 0b0000_100//10진수 10
    var z = 0x0F //10진수 15

    println("x shl 2-> ${x shl 2}") //16
    println("x.inv->${x.inv()}")

    println("y shr 2 ->${y/4},${y/4},${y shr 2}") //2,2
    println("x shl 4 ->${x*16},${x shl 4}") //64,64
    println("z shl 4 ->${z*16},${z shl 4}") //240,240

    x = 64
    println("x shr 4->${x/4},${x shr 2}") //16,16
}