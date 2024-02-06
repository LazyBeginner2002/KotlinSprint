package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("Куриная грудка", "Масло", "Помидоры", "Лук", "Зелень", "Майонез", "Соль", "Перец")
    print("Введите искомый ингредиент: ")
    val desiredIngredient = readln()

    for (i in ingredients) {
        if (i == desiredIngredient) {
            println("Ингредиент \"$i\" в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")
}