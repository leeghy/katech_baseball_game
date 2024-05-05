package com.example.number_baseball_game

import kotlin.random.Random

class random {
    val ranNumber: Array<Int?> = arrayOfNulls<Int>(3)

    fun randomNumber() {
        val set: HashSet<Int> = HashSet()
        val list: ArrayList<Int> = ArrayList()

        while (set.size < 3) {
            val randomValue = Random.nextInt(1, 10)

            set.add(randomValue)
        }

        list.addAll(set)
        list.shuffle()

        val iterator = set.iterator()
        for (index in 0..2) {
            if (iterator.hasNext()) {
                ranNumber[index] = iterator.next()
            }
        }

        fun getRanNumber(): Array<Int?> {
            return ranNumber
        }
    }
}