package org.example.lesson_2

fun main() {
    val hourOfDepartureTime = 9
    val minuteOfDepartureTime = 39
    val minutesOfTravelTime = 457

    val minutesOfDepartureTime = hourOfDepartureTime * 60 + minuteOfDepartureTime
    val minutesOfArrivalTime = minutesOfDepartureTime + minutesOfTravelTime

    val hourOfArrivalTime = minutesOfArrivalTime / 60
    val minuteOfArrivalTime = minutesOfArrivalTime % 60

    println("Время прибытия поезда: $hourOfArrivalTime:$minuteOfArrivalTime")
}
