package com.example.test.ch3

val cus1 = Customer("Sean","sean@mail.com")
val cus2 = Customer("Sean","sean@mail.com")


data class Customer(var name: String, var email: String) {
    var job: String = "Unknown"

    constructor(name: String, email: String, _job: String) : this(name, email) {
        job = _job
    }

    init {
// 간단한 로직은 여기에
    }
}