package org.example.lesson_8

fun main() {
    val numberOfViews = intArrayOf(423, 1313, 13124, 333, 13133, 31313, 54434)
    var totalViews = 0

    for (i in numberOfViews) {
        totalViews += i
    }

    println("Общее кол-во просмотров: $totalViews")
}