package org.example.lesson_13

private val phoneBook = mutableListOf<TelephoneUsers>()

fun main() {
    val user1 = TelephoneUsers("David")
    print("Введите номер телефона пользователя: ")
    user1.phoneNumber = readln().toLongOrNull()
    print("Введите компанию оператора пользователя: ")
    user1.operatorCompany = readln()
    addToPhoneBook(user1)
}

fun addToPhoneBook(user: TelephoneUsers) {
    if (user.phoneNumber != null) phoneBook.add(user)
    else println("\nТелефон пользователя не указан")
}

class TelephoneUsers(val name: String, var phoneNumber: Long? = null, var operatorCompany: String? = null)

