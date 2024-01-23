package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val reservedTablesForToday = 13
    val reservedTablesForTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${reservedTablesForToday != NUMBER_OF_TABLES}\n" +
                "Доступность столиков на завтра: ${reservedTablesForTomorrow != NUMBER_OF_TABLES}"
    )
}

