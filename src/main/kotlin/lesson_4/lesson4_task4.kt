package org.example.lesson_4

fun main() {
    val dayNumber = 2
    val arms: Boolean
    val legs: Boolean
    val back: Boolean
    val absMuscles: Boolean

    if (dayNumber % 2 == 1){
        arms = true
        legs = false
        back = false
        absMuscles = true
    } else {
        arms = false
        legs = true
        back = true
        absMuscles = false
    }

    println("""
        Упражнения для рук: $arms
        Упражнения для ног: $legs
        Упражнения для спины: $back
        Упражнения для пресса: $absMuscles
    """.trimIndent())
}