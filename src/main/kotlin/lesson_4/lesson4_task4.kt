package org.example.lesson_4

fun main() {
    val dayNumber = 2u

    val isEven = dayNumber % 2u == 0u

    var printArms = true
    var printLegs = false
    var printBack = false
    var printAbsMuscles = true

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



