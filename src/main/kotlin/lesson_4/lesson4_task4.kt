package org.example.lesson_4

fun main() {
    val dayNumber = 5u

    val isEven = dayNumber % 2u == 0u

    val printArms = !isEven
    val printLegs = isEven
    val printBack = isEven
    val printAbsMuscles = !isEven

    println(
        """
        Упражнения для рук: $printArms 
        Упражнения для ног: $printLegs
        Упражнения для спины: $printBack
        Упражнения для пресса: $printAbsMuscles
    """.trimIndent()
    )
}



