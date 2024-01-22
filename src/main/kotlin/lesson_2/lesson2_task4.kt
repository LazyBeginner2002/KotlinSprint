package org.example.lesson_2

const val PERCENT_TO_REAL_NUMBER = 100

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val bonusPercent = 20.0f

    val bonusMultiplier = bonusPercent/PERCENT_TO_REAL_NUMBER
    val bonusCrystalOre = (crystalOre * bonusMultiplier).toInt()
    val bonusIronOre = (ironOre * bonusMultiplier).toInt()

    println("Бонус к кристаллической руде составил: $bonusCrystalOre")
    println("Бонус к железной руде составил: $bonusIronOre")
}
