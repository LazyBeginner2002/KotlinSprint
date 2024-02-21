package org.example.lesson_13

fun main() {
    val user1 = TelUser("David")
    user1.fillInfoAboutUser()
}

class TelUser(
    val name: String,
    private var phoneNumber: Long? = null,
    private var operatorCompany: String? = null
) {
    fun fillInfoAboutUser() {
        print("Введите номер телефона пользователя: ")
        val inputPhoneNumber = readln()
        for (i in inputPhoneNumber) {
            if (!i.isDigit()) throw Exception("Incorrect data entered")
        }
        phoneNumber = inputPhoneNumber.toLongOrNull()
        print("Введите компанию оператора пользователя: ")
        operatorCompany = readln()
    }
}