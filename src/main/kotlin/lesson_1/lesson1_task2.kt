package org.example.lesson_1

fun main() {
    val numberOfOrders : Byte = 75
    val thanksForThePurchase : String = "Благодарим вас за покупку, заходите еще!"

    println("Количество заказов составляет: $numberOfOrders")
    println("Сообщение после покупки: \"$thanksForThePurchase\"")

    var numberOfWorkers = 2000
    //println(numberOfWorkers)

    numberOfWorkers -= 1
    println("Количество работников составляет: $numberOfWorkers")
}