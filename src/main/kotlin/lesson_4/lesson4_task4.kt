package org.example.lesson_4

fun main() {
    val dayNumber = 5u
    val arms = true
    val legs = false
    val back = false
    val absMuscles = true

    val isEven = dayNumber % 2u == 0u

    var printArms = arms
    var printLegs = legs
    var printBack = back
    var printAbsMuscles = absMuscles

    if (isEven) {
        printArms = !printArms
        printLegs = !printLegs
        printBack = !printBack
        printAbsMuscles = !printAbsMuscles
    }

    println(
        """
        Упражнения для рук: $printArms
        Упражнения для ног: $printLegs
        Упражнения для спины: $printBack
        Упражнения для пресса: $printAbsMuscles
    """.trimIndent()
    )
}



