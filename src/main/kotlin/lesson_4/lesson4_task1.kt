package org.example.lesson_4

fun main() {
    val numberOfTables = 13
    val reservedTablesForToday = 13
    val reservedTablesForTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${reservedTablesForToday != numberOfTables}\n" +
                "Доступность столиков на завтра: ${reservedTablesForTomorrow != numberOfTables}"
    )
}

