package com.example.diceroller

//Practice


fun main(){
    val firstDice = Dice2(6)
    val rollResult = firstDice.roll()
//    println("${firstDice.numberSides} sided dice rolled ${firstDice.roll()}")

    val luckyNumber = 4


//    if (rollResult == luckyNumber) {
//        println("You win!")
//    } else if (rollResult == 1) {
//        println("So sorry! You rolled a 1. Try again!")
//    } else if (rollResult == 2) {
//        println("Sadly, you rolled a 2. Try again!")
//    } else if (rollResult == 3) {
//        println("Unfortunately, you rolled a 3. Try again!")
//    } else if (rollResult == 5) {
//        println("Don't cry! You rolled a 5. Try again!")
//    } else {
//        println("Apologies! You rolled a 6. Try again!")
//    }


    when (rollResult) {
        luckyNumber -> println("You won!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! You rolled a 6. Try again!")
    }
}

class Dice2(val numberSides: Int){
    fun roll():Int{
        return (1..numberSides).random()
    }
}