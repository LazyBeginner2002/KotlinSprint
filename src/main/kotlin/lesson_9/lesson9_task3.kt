package org.example.lesson_9

fun main() {
    val quantityOfIngredientsForOneDish = mutableListOf(2, 50, 15)

    println("Сколько порций блюда требуется?")
    val numberOfDishes = readln().toInt()

    val quantityOfIngredientsForNDish = quantityOfIngredientsForOneDish.map { it * numberOfDishes }

    println(
        "На $numberOfDishes порций вам понадобится: Яиц - ${quantityOfIngredientsForNDish[0]} шт., молока - " +
                "${quantityOfIngredientsForNDish[1]} мл., сливочного масла - ${quantityOfIngredientsForNDish[2]} гр."
    )
}