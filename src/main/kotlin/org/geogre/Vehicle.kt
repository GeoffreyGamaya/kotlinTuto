package org.geogre

interface Vehicle {

    val name: String

    fun run() {
        println("vroom vroom")
    }

    fun getDoors() : Int


}