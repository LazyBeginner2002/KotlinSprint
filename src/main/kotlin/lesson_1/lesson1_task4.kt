package org.example.lesson_1

fun main() {
    val length : Long = 40_868_600_000 // L не пишем, т.к. явно указали тип данных
    val age : Byte = 27
    val partOfDay : Float = 0.075F // Но здесь почему-то пишем :D
    val seconds : Short = 6480
    val partOfYear : Double = 2.0547945205479453E-4
    val apogee : Int = 327000

    println(length)
    println(age)
    println(partOfDay)
    println(seconds)
    println(partOfYear)
    println(apogee)
}