package org.geogre

fun main(args: Array<String>) {
    println("Hello World !")

    val aa = "hello"
    var aaa: String
    val aaaa: String

    ifBlock()
    switchBlock()
    forBlock()

    println(myFunction(1,2))
    println(myFunction1(3,3))
    println(myFunction2(5,5))
    println(withDefaults())
    println(withDefaults(1, 2))
    println(withDefaults(10, 20, "Hello"))
    println(withDefaults(param3 = "Greetings"))
    println(withDefaults(param1 = 2, param3 = "Greetings"))
}

private fun forBlock() {
    println("classic for loop")
    for (item in 1..10) {
        print("$item, ")
    }

    println("loop over char")
    for (ch in "biscuit") {
        println(ch)
    }

    println("loop with range")
    var ndx = 0
    for(item in 10.rangeTo(20).step(2)){
        print("${++ndx}) $item, ")
    }

    println("loop with range with index")
    for((index, item) in 10.rangeTo(20).step(2).withIndex()){
        print("${index + 1}) $item, ")
    }
    println()

    val myArray = arrayOf(10, 20, 30, 40, 50)
    for(item in myArray.indices) {
        println("At index $item is ${myArray[item]}")
    }
    println()
}

private fun switchBlock() {
    val burgersOrdered = 8

    when (burgersOrdered) {
        0 -> println("Not hungry")
        1, 2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> {
            println("Are you sure?")
        }
    }

    when (burgersOrdered) {
        Math.abs(burgersOrdered) -> println("ordered 0 or more burgers")
        else -> {
            println("Ordered less than 0")
        }
    }

    when (burgersOrdered) {
        0 -> println("We need orders")
        in 1..4 -> println("Got some orders")
        in 5..9 -> println("Business is up")
        else -> {
            println("Not sure")
        }
    }

    when {
        burgersOrdered <= 0 -> println("None ordered")
        burgersOrdered % 2 == 1 -> println("Odd number ordered")
        burgersOrdered % 2 == 0 -> println("Even number ordered")
    }
}

private fun ifBlock() {
    val lowest = if (3 < 5) 10 else 11;
    println("The lowest value is $lowest")

    val temp = 80
    val isAirConditionerOn = if (temp >= 80) {
        println("It is warm")
        true
    } else {
        println("It is not so warm")
        false
    }
    println("Is the air conditioner on: $isAirConditionerOn")
}

fun myFunction(param1: Int, param2: Int): Int {
    return param1 + param2
}

fun myFunction1(param1: Int, param2: Int): Int = param1 + param2

fun myFunction2(param1: Int, param2: Int) = param1.toString() + " some text " + param2.toString()

fun withDefaults(param1: Int = 1, param2: Int = 5, param3: String = "default message"): Int {
    println(param3)
    val results = param1 + param2
    return results
}
