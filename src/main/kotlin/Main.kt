package ru.netology

fun main() {
    val price = 15000
    val regular = true
    var finalSum = price
    if (price in 1001..10000) finalSum -= 100
    if (price > 10000) finalSum -= price / 100 * 5
    if (regular) finalSum -= finalSum / 100 * 1
    println(finalSum)
}