package org.example.lesson_13

fun main() {
    val listOfTelephoneUsers = listOf(
        TelephoneUser("David", 89260296900),
        TelephoneUser("Andrew", 89265554142),
        TelephoneUser("Vladimir", 8926423434, "null"),
        TelephoneUser("Oleg", 89266566655, "Beeline"),
        TelephoneUser("George", 89262433344, "Beeline"),
    )
    println(listOfTelephoneUsers.map { it.operatorCompany}.toSet().filterNotNull())
}

class TelephoneUser(val name: String, val phoneNumber: Long, val operatorCompany: String? = null)