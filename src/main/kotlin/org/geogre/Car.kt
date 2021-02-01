package org.geogre

class Car : Vehicle {
    override val name = "mercedes"

    override fun getDoors(): Int {
        return 4
    }
}