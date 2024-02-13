package org.example.lesson_11

fun main() {

}

class Recipe(val image: String, val dishName: String, val recipeDescription: String,
             val ingredients: List<Ingredient>, cookingSteps: MutableList<String>) {

}

class RecipeCategory(val image: String, val name: String, val description: String,) {

}

class Ingredient(val name: String, val amountOfDishes: Int, val amountOfIngredient: Int, val unit: String,) {

}