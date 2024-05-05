package com.example.number_baseball_game

class userInput {

    val userNumber: Array<Int?> = arrayOfNulls<Int>(3)

    fun userInput() {
        while (true) {
            print("숫자 세 개를 입력해주세요: ")
            val inputNumber: String = readLine()!!

            if (inputNumber.length == 3) {
                userNumber[0] = inputNumber.substring(0, 1).toInt()
                userNumber[1] = inputNumber.substring(1, 2).toInt()
                userNumber[2] = inputNumber.substring(2, 3).toInt()
            }
        }
    }
}