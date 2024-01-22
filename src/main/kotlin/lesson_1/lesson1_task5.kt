package org.example.lesson_1

const val SEC_IN_HOUR = 3600
const val SEC_IN_MIN = 60

fun main() {
    val seconds = 6480

    val hour = seconds / SEC_IN_HOUR
    val minute = (seconds - hour * SEC_IN_HOUR) / SEC_IN_MIN
    val second = seconds - hour * SEC_IN_HOUR - (minute * SEC_IN_MIN)

    println(String.format("Время, которое Гагарин провел в космосе: %02d:%02d:%02d", hour, minute, second))
}