package org.example.lesson_4

const val MIN_WEIGHT_FOR_AVERAGE = 35
const val MAX_WEIGHT_FOR_AVERAGE = 100
const val MAX_VOLUME_FOR_AVERAGE = 100

fun main() {
    var weight = 20.0f
    var volume = 80.0f

    println("Груз с весом $weight и объемом $volume соответствует категории 'Average': " +
            "${(weight >= MIN_WEIGHT_FOR_AVERAGE) && (weight <= MAX_WEIGHT_FOR_AVERAGE) 
                    && volume < MAX_VOLUME_FOR_AVERAGE}")

    weight = 50.0f
    volume = 100.0f

    println("Груз с весом $weight и объемом $volume соответствует категории 'Average': " +
            "${(weight >= MIN_WEIGHT_FOR_AVERAGE) && (weight <= MAX_WEIGHT_FOR_AVERAGE)
                    && volume < MAX_VOLUME_FOR_AVERAGE}")
}
