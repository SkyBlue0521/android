package com.example.test

import java.security.InvalidAlgorithmParameterException

class InvalidNameException(message:String):Exception(message)

fun main() {
    var name = "Kildong123"
    try {
        validateName(name)
    } catch (e:InvalidNameException){
        println(e.message)
    } catch(e:Exception) {
        println(e.message)
    }
}
fun validateName(name:String) {
    if(name.matches(Regex(".*\\d+.*"))){
    throw InvalidNameException("Your name : $ name:contains numerals.")
    }
}