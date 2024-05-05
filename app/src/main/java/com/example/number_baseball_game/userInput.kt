package com.example.number_baseball_game

class userInput {

    val userNumber: Array<Int?> = arrayOfNulls<Int>(3)

    fun userInput() {
        while (true) {
            print("숫자 세 개를 입력해주세요: ")
            val inputNumber: String = readLine()!!

            if (inputNumber == null || inputNumber.length != 3) {
                throw IllegalArgumentException("다시 입력해주세요.")
            }

            try {
                // 각 자리 숫자를 배열에 저장
                userNumber[0] = inputNumber.substring(0, 1).toInt()
                userNumber[1] = inputNumber.substring(1, 2).toInt()
                userNumber[2] = inputNumber.substring(2, 3).toInt()
                break // 유효한 입력을 받았으므로 while 루프 종료
            } catch (e: NumberFormatException) {
                // 입력된 값이 숫자가 아닌 경우 예외 발생
                throw IllegalArgumentException("입력된 값은 숫자가 아닙니다.")
            }

        }
    }
}