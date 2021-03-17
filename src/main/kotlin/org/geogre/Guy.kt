package org.geogre

open class Guy internal constructor() {

    var fname = ""
    var lastName = ""
    var age :Int = 0

    init {
        println("create an object ${fname}")
    }

    constructor(fname: String, lastName: String) : this() {
        this.fname = fname
        this.lastName = lastName
    }

    constructor(fname: String, lastName: String, age: Int) : this() {
        this.fname = fname
        this.lastName = lastName
        this.age = age
    }

}
