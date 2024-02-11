package org.example.lesson_11

fun main() {
    val user1 = User2(1, "My_Login", "My_Password", "My_E-mail@gmail.com")

    user1.readBio()
    user1.changePassword()
    user1.showInfo()
}

private class User2(
    val id: Int,
    val login: String,
    var password: String,
    val eMail: String,
    var bio: String = "",
) {
    fun showInfo() {
        println(
            """
            User properties:
                    id: $id
                    login: $login
                    password: $password
                    e-mail: $eMail
                    biography: $bio
        """.trimIndent()
        )
    }

    fun readBio() {
        println("Напишите информацию о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите старый пароль:")
        val oldPassword: String = readln()

        if (oldPassword == password) {
            println("Введите новый пароль:")
            password = readln()
        } else println("Пароль введен неверно")
    }
}