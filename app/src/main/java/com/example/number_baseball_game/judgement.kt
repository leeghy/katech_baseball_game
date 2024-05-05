package com.example.number_baseball_game

class judgement {

    var strike: Int = 0
    var ball: Int = 0
    fun judge(inputNumber: Array<Int>, outputNumber:Array<Int>) {
        resetCounts()

        inputNumber.forEachIndexed { index, inputNum ->
            if (inputNum == outputNumber[index]) {
                strike++
            } else if (inputNum in outputNumber) {
                ball++
            }
        }
    }

    private fun resetCounts() {
        strike = 0
        ball = 0
    }
}