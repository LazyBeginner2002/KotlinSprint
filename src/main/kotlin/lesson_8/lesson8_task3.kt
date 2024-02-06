package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("Куриная грудка", "Масло", "Помидоры", "Лук", "Зелень", "Майонез", "Соль", "Перец")
    print("Введите искомый ингредиент: ")
    val desiredIngredient = readln()

    if (ingredients.contains(desiredIngredient)) {
        println("Ингредиент \"$desiredIngredient\" в рецепте есть")
    } else println("Такого ингредиента в рецепте нет")
}