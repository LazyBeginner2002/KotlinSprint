package org.example.lesson_11

fun main() {
    val forum1 = Forum()
    val forumUser1 = forum1.createNewUser("David")
    val forumUser2 = forum1.createNewUser("Ivan")
    forum1.createNewMessage(forumUser1.userId)
    forum1.createNewMessage(forumUser1.userId)
    forum1.createNewMessage(forumUser2.userId)
    forum1.createNewMessage(forumUser2.userId)
    forum1.printThread()
}

class Forum(
    private val listOfUsers: MutableList<ForumUser> = mutableListOf(),
    private val listOfMessages: MutableList<ForumMessage> = mutableListOf(),
) {
    private var userId = 0
    fun createNewUser(userName: String): ForumUser {
        val forumUser = ForumUser(userId, userName)
        listOfUsers.add(forumUser)
        return forumUser.also { userId++ }
    }

    fun createNewMessage(id: Int): ForumMessage? {
        if (listOfUsers.find { it.userId == id } == null) return null
        else {
        println("Введите сообщение:")
        val message = readln()
        val forumMessage = ForumMessage(id, message)
        listOfMessages.add(forumMessage)
        return forumMessage
            }
    }

    fun printThread() {
        listOfMessages.forEach { println("${listOfUsers[it.authorId].userName}: ${it.message}") }
    }
}

class ForumUser(val userId: Int, val userName: String)

class ForumMessage(val authorId: Int, val message: String)
