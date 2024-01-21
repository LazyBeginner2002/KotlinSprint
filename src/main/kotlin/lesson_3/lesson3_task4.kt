package org.example.lesson_3



fun main() {
    var from = "E2"
    var to = "E4"
    var moveNumber: Short = 1

    println("White moved from $from to $to, move number is $moveNumber.")

    from = "D2"
    to = "D3"
    ++moveNumber

    println("White moved from $from to $to, move number is $moveNumber.")
}