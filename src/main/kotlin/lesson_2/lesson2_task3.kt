package org.example.lesson_2

const val MIN_IN_HOUR = 60

fun main() {
    val hourOfDepartureTime = 9
    val minuteOfDepartureTime = 39
    val minutesOfTravelTime = 457

    val minutesOfDepartureTime = hourOfDepartureTime * MIN_IN_HOUR + minuteOfDepartureTime
    val minutesOfArrivalTime = minutesOfDepartureTime + minutesOfTravelTime

    val hourOfArrivalTime = minutesOfArrivalTime / MIN_IN_HOUR
    val minuteOfArrivalTime = minutesOfArrivalTime % MIN_IN_HOUR

    println("Время прибытия поезда: $hourOfArrivalTime:$minuteOfArrivalTime")
}
