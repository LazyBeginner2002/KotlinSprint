package org.example.lesson_4

const val MIN_WEIGHT_FOR_AVERAGE = 35
const val MAX_WEIGHT_FOR_AVERAGE = 100
const val MAX_VOLUME_FOR_AVERAGE = 100

fun main() {
    val goods1 = Goods(20.0f,80.0f)
    val goods2 = Goods(50.0f,100.0f)

    println("Груз с весом ${goods1.weight} и объемом ${goods1.volume} соответствует категории 'Average': " +
            "${(goods1.weight >= MIN_WEIGHT_FOR_AVERAGE) && (goods1.weight <= MAX_WEIGHT_FOR_AVERAGE) 
                    && goods1.volume <= MAX_VOLUME_FOR_AVERAGE}")

    println("Груз с весом ${goods2.weight} и объемом ${goods2.volume} соответствует категории 'Average': " +
            "${(goods2.weight >= MIN_WEIGHT_FOR_AVERAGE) && (goods2.weight <= MAX_WEIGHT_FOR_AVERAGE)
                    && goods2.volume <= MAX_VOLUME_FOR_AVERAGE}")
}

class Goods (val weight: Float, val volume: Float)

// Сделал с классом, ибо два объекта с одинаковыми св-вами.
// Класс не засунул в отдельный файл, просто чтобы одним файлом была задача.
// Вывод громоздкий. Я сделал бы функцию проверки на Average в классе, но в задании сказано сделать сравнение в print()

