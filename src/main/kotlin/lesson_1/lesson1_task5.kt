package org.example.lesson_1

fun main() {
    val seconds = 6480
    val hour = seconds / 3600
    val minute = (seconds - (hour * 3600)) / 60
    val second = seconds - (hour * 3600) - (minute * 60)

    println("Время, которое Гагарин провел в космосе: 0$hour:$minute:0$second")
}