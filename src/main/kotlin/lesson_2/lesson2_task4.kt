package org.example.lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val bonusMultiplier = 0.2f

    val bonusCrystalOre = (crystalOre * bonusMultiplier).toInt()
    val bonusIronOre = (ironOre * bonusMultiplier).toInt()

    println("Бонус к кристаллической руде составил: $bonusCrystalOre")
    println("Бонус к железной руде составил: $bonusIronOre")
}
