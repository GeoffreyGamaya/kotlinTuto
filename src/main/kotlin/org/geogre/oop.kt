package org.geogre

import com.geogrej.CallInKotlin

fun main(args: Array<String>) {

    val guy1 = Guy("geoffrey", "Vincent")
    println(guy1.toString())

    val guy2 = Guy("foo", "bar", 45)
    println(guy2.toString())

    val coordinate = object {
        private var x = 200
        private val y = 400
        fun printPos() {
            println("$x and $y")
        }
    }

    coordinate.printPos()

    val temp = MyObj
    println(temp.getLastTemp())

    val car = Car()
    car.run()
    println(car.getDoors())

    val javaObj = CallInKotlin("geoff", "vib", 34)
    println("java object getter is " + javaObj.age)
}


object MyObj {
var temperature = arrayOf(10,20,40)
    fun getLastTemp() {
        temperature.last()
    }
}

