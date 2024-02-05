package org.example.lesson_8

fun main() {
    print("Количество ингредиентов в блюде: ")
    val numberOfIngredients = readln().toInt()

    val ingredients = Array<String>(numberOfIngredients) { i -> i.toString() }
    for (i in ingredients.indices) {
        print("Введите ${i + 1} ингредиент: ")
        ingredients[i] = readln()
    }

    for (i in ingredients) print("$i ")
}