package org.example.lesson_11

val userStatus = mapOf(1 to "разговаривает", 2 to "микрофон выключен", 3 to "пользователь заглушен")

fun main() {
    val room1 = Room("*Ссылка на drawable resource?*", "Комната 1", mutableListOf())
    val user1 = User("*Ссылка на drawable resource*", "David", "${userStatus[1]}")
    user1.showInfo()
    room1.addMember(user1)
    room1.updateStatus("David", "${userStatus[2]}")
    user1.showInfo()
}

class Room(
    val cover: String,
    val name: String,
    private val listOfMembers: MutableList<User>,
) {
    fun addMember(user: User) {
        listOfMembers.add(user)
    }

    fun updateStatus(nickname: String, newStatus: String) {
        listOfMembers.find { it.nickname == nickname }
            ?.apply { status = newStatus }
            ?: println("\nПользователь не найден.\n")
    }
}

class User(
    val userpic: String,
    val nickname: String,
    var status: String,
) {

    fun showInfo() {
        println(
            """
            $nickname
            $status
        """.trimIndent()
        )
    }
}