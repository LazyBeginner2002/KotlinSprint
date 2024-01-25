package org.example.lesson_4

fun main() {
    val dayNumber = 4u
    val arms = true
    val legs = false
    val back = false
    val absMuscles = true

    val isEven = dayNumber % 2u == 0u

    if (!isEven) {
        println("""
        Упражнения для рук: $arms
        Упражнения для ног: $legs
        Упражнения для спины: $back
        Упражнения для пресса: $absMuscles
    """.trimIndent())
    } else {
        println("""
        Упражнения для рук: ${!arms}
        Упражнения для ног: ${!legs}
        Упражнения для спины: ${!back}
        Упражнения для пресса: ${!absMuscles}
    """.trimIndent())
    }
}



