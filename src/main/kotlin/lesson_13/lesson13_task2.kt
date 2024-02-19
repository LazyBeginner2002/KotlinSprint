package org.example.lesson_13

fun main() {
    val phoneUser1 = PhoneUsers("David", 8926029690, "Beeline")
    phoneUser1.printInfoAboutPhoneUser(phoneUser1.name, phoneUser1.phoneNumber, phoneUser1.operatorCompany)
}

class PhoneUsers(val name: String, val phoneNumber: Long, val operatorCompany: String? = null) {
    fun printInfoAboutPhoneUser(name: String, phoneNumber: Long, operatorCompany: String?) {
        val operator = operatorCompany ?: "<не указано>"
        println("- Имя: $name\n- Номер: $phoneNumber\n- Оператор: $operator")
    }
} // Не будет ли эффективнее передавать в ф-ию объект?