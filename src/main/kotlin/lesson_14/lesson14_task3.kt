package org.example.lesson_14

import kotlin.math.PI
import kotlin.math.pow

fun main() {
    val listOfFigures = mutableListOf<Figure>()
    var sumOfBlackFiguresPerimeters = 0
    var sumOfWhiteFiguresAreas = 0

    val circle1 = Circle("Black", 4).also { listOfFigures.add(it) }
    val circle2 = Circle("Black", 6).also { listOfFigures.add(it) }
    val circle3 = Circle("White", 6).also { listOfFigures.add(it) }

    val rectangle1 = Rectangle("Black", 2, 8).also { listOfFigures.add(it) }
    val rectangle2 = Rectangle("White", 2, 8).also { listOfFigures.add(it) }
    val rectangle3 = Rectangle("White", 2, 8).also { listOfFigures.add(it) }

    listOfFigures.forEach{if (it.color == "Black") sumOfBlackFiguresPerimeters += it.calculatePerimeter().toInt()}
    listOfFigures.forEach{if (it.color == "White") sumOfWhiteFiguresAreas += it.calculateArea().toInt()}

    println("Сумма периметров черных фигур равна: $sumOfBlackFiguresPerimeters")
    println("Сумма площадей белых фигур равна: $sumOfWhiteFiguresAreas")
}

abstract class Figure() {

    abstract val color: String
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

class Rectangle(
    override val color: String,
    private val height: Int,
    private val width: Int,
) : Figure() {
    override fun calculatePerimeter(): Double {
        return (height + width) * 2.0
    }

    override fun calculateArea(): Double {
        return (height * width).toDouble()
    }

}

class Circle(
    override val color: String,
    private val radius: Int
) : Figure() {
    override fun calculatePerimeter(): Double {
        return 2.0 * PI * radius
    }

    override fun calculateArea(): Double {
        return PI * radius.toDouble().pow(2.0)
    }
}