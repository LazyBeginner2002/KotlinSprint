package org.example.lesson_13

fun main() {
    val phoneUser1 = PhoneUsers("David", 8926029690, "Beeline")
    phoneUser1.printInfoAboutPhoneUser()
}

class PhoneUsers(private val name: String, private val phoneNumber: Long, private val operatorCompany: String? = null) {
    fun printInfoAboutPhoneUser() {
        val operator = operatorCompany ?: "<не указано>"
        println("- Имя: $name\n- Номер: $phoneNumber\n- Оператор: $operator")
    }
}