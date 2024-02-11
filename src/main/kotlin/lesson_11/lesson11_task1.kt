package org.example.lesson_11

fun main() {
    val user1 = User(
        1,
        "user1login",
        "user1password",
        "user1@gmail.com",
    )

    val user2 = User(
        2,
        "user2login",
        "user2password",
        "user2@gmail.com",
    )

    println(
        """
        User 1 properties:
        id: ${user1.id}
        login: ${user1.login}
        password: ${user1.password}
        e-mail: ${user1.eMail}
        
        User 2 properties:
        id: ${user2.id}
        login: ${user2.login}
        password: ${user2.password}
        e-mail: ${user2.eMail}
    """.trimIndent()
    )
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val eMail: String,
)