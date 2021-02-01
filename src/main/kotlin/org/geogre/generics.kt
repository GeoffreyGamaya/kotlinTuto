package org.geogre


fun main(args: Array<String>) {

    val maxInt = max(42, 45)
    val maxLon = max(2L, 67777L)
    val maxByte = max((-128).toByte(), (127).toByte())
    val maxString = max("aa", "bb")

    println(maxInt)
    println(maxLon)
    println(maxByte)
    println(maxString)
}

fun <T: Comparable<T>> max(param1: T, param2: T):T {
    val results = param1.compareTo(param2)
    return if (results > 0) param1 else param2
}
