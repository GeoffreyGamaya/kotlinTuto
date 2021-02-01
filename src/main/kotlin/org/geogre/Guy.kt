package org.geogre

class Guy internal constructor( fname: String, lastName: String) {

    var fname = ""
    var lastName = ""
    var age :Int = 0

    init {
        println("create an object ${fname}")
    }

    constructor(fname: String, lastName: String, age: Int) : this(fname, lastName) {
        this.fname = fname
        this.lastName = lastName
        this.age = age
    }

}
