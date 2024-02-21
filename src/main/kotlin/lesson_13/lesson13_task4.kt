package org.example.lesson_13

fun main() {
    val phoneBook = PhoneBook()
    val user1 = TelephoneUsers("David")
    user1.fillInfoAboutUser()
    phoneBook.addToPhoneBook(user1)
}

class PhoneBook(private val phoneBook: MutableList<TelephoneUsers> = mutableListOf()) {
    fun addToPhoneBook(user: TelephoneUsers) {
        if (user.phoneNumber != null) phoneBook.add(user).also { println("\nПользователь добавлен в телефонную книгу") }
        else println("\nТелефон пользователя не указан")
    }
}

class TelephoneUsers(
    val name: String,
    var phoneNumber: Long? = null,
    private var operatorCompany: String? = null
) {
    fun fillInfoAboutUser() {
        print("Введите номер телефона пользователя: ")
        phoneNumber = readln().toLongOrNull()
        print("Введите компанию оператора пользователя: ")
        operatorCompany = readln()
    }
}