package org.example.lesson_2

fun main() {
    val numberOfEmployees = 50
    val employeeSalary = 30000
    val numberOfProbationers = 30
    val probationersSalary = 20000

    val employeeSalaryAmount = numberOfEmployees * employeeSalary
    println(employeeSalaryAmount)

    val workersSalaryAmount = employeeSalaryAmount + (numberOfProbationers * probationersSalary)
    println(workersSalaryAmount)

    val averageWorkerSalary = workersSalaryAmount / (numberOfEmployees + numberOfProbationers)
    println(averageWorkerSalary)
}
