package org.example.lesson_4

const val MIN_WEIGHT_FOR_AVERAGE = 35
const val MAX_WEIGHT_FOR_AVERAGE = 100
const val MAX_VOLUME_FOR_AVERAGE = 100

fun main() {
    val weight1 = 20.0f
    val volume1 = 80.0f
    val weight2 = 50.0f
    val volume2 = 100.0f

    println("Груз с весом $weight1 и объемом $volume1 соответствует категории 'Average': " +
            "${(weight1 >= MIN_WEIGHT_FOR_AVERAGE) && (weight1 <= MAX_WEIGHT_FOR_AVERAGE) 
                    && volume1 <= MAX_VOLUME_FOR_AVERAGE}")

    println("Груз с весом $weight2 и объемом $volume2 соответствует категории 'Average': " +
            "${(weight2 >= MIN_WEIGHT_FOR_AVERAGE) && (weight2 <= MAX_WEIGHT_FOR_AVERAGE)
                    && volume2 <= MAX_VOLUME_FOR_AVERAGE}")
}
