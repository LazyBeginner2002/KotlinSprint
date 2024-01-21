package org.example.lesson_1

fun main() {
    val year = "1961"
    val departureTime = "09:07"
    val arrivalTime = "10:55"
    val partsOfDepartureTime = departureTime.split(':')
    val partsOfArrivalTime = arrivalTime.split(':')
    var hour = partsOfDepartureTime[0]
    var minute = partsOfDepartureTime[1]

    println("Год полета: $year")
    println("Час взлета: $hour")
    println("Минута взлета: $minute")

    hour = partsOfArrivalTime[0]
    minute = partsOfArrivalTime[1]

    print("Время посадки: $hour:$minute")
}