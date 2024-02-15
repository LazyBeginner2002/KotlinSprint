package org.example.lesson_11

fun main() {
    val forum1 = Forum()
    forum1.createNewUser("David")
    forum1.createNewUser("Ivan")
    forum1.createNewMessage(0)
    forum1.createNewMessage(0)
    forum1.createNewMessage(1)
    forum1.createNewMessage(1)
    forum1.printThread()
}

class Forum(
    private val listOfUsers: MutableList<ForumUser> = mutableListOf(),
    private val listOfMessages: MutableList<ForumMessage> = mutableListOf(),
) {
    private var userId = 0
    fun createNewUser(userName: String): ForumUser {
        userId++
        listOfUsers.add(ForumUser(userId, userName))
        return ForumUser(userId, userName)
    }

    fun createNewMessage(userId: Int): ForumMessage? {
        //if (listOfUsers.contains(ForumUser(userId, listOfUsers.find { it.userId == userId}.toString()))) {
        if (listOfUsers.contains(listOfUsers[userId])) {
            println("Введите сообщение:")
            val message = readln()
            listOfMessages.add(ForumMessage(userId, message))
            return ForumMessage(userId, message)
        } else return null
    }

    fun printThread() {
        listOfMessages.forEach { println("${listOfUsers[it.authorId].userName}: ${it.message}") }
    }
}

class ForumUser(val userId: Int, val userName: String)

class ForumMessage(val authorId: Int, val message: String)
