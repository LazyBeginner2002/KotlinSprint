package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("Куриная грудка", "Масло", "Помидоры", "Лук", "Зелень", "Майонез", "Соль", "Перец")
    for (i in ingredients) print("$i ")

    println("\nКакой ингредиент вы хотите заменить?")
    val oldIngredient = readln()

    if (ingredients.contains(oldIngredient)) {
        print("Введите название нового ингредиента: ")
        val newIngredient = readln()
        ingredients[ingredients.indexOf(oldIngredient)] = newIngredient
        for (i in ingredients) print("$i ")
    } else {
        println("Такого ингредиента в списке нет")
    }
}