package com.example.number_baseball_game

import kotlin.random.Random

class random {
    val ranNumber: Array<Int?> = arrayOfNulls<Int>(3)

    fun randomNumber() {
        val set: HashSet<Int> = HashSet()
        val list: ArrayList<Int> = ArrayList()

        while (set.size < 3) {
            val randomValue = Random.nextInt(8) + 1

            set.add(randomValue)
        }

        list.addAll(set)
        list.shuffle()

        for ((index, number: Int) in list.withIndex()) {
            ranNumber[index] = number
        }
    }
}