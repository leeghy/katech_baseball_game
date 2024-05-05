package com.example.number_baseball_game


fun main() {
    println("숫자야구 게임 시작")
    var answer: random = random()
    answer.randomNumber()
//    println(answer.ranNumber.contentToString())

    var judge: judgement = judgement()
    val user = userInput(judge)
    user.userInput(answer.ranNumber, judge)
    judge.judge(user.userNumber, answer.ranNumber)


}