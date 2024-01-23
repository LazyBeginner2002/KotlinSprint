package org.example.lesson_3

fun main() {
    val name = "Татьяна"
    var surname = "Андреева"
    val fatherName = "Сергеевна"
    var age: Byte = 20

    println("$surname $name $fatherName, $age")

    surname = "Сидорова"
    age = 22

    println("$surname $name $fatherName, $age")
}