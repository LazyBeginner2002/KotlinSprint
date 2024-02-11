package org.example.lesson_11

val userStatus = mapOf(1 to "разговаривает", 2 to "микрофон выключен", 3 to "пользователь заглушен")

fun main() {
    val room1 = Room("*Ссылка на drawable resource?*", "Комната 1", mutableListOf())
}

class Room(
    val cover: String,
    val name: String,
    private val listOfMembers: MutableList<String>,
) {
    fun addMember(user: User) {
        listOfMembers.add(user.nickname)
    }
}

class User(
    val userpic: String,
    val nickname: String,
    var status: String,
) {
    fun updateStatus(nickname: String, newStatus: String) {
        status = newStatus
    }

    fun showInfo() {
        println(
            """
            $nickname
            $status
        """.trimIndent()
        )
    }
}