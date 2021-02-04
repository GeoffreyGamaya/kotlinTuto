package org.geogre
import arrow.syntax.function.curried
import arrow.syntax.function.pipe
import arrow.syntax.function.reverse
import arrow.syntax.function.uncurried

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Ginger", 19),
        Student("Michael", 23),
        Student("Maria", 20),
        Student("Joe", 39),
        Student("Bob", 16)
    )
}

fun main(args: Array<String>) {
    val students = getStudents()
    students.stream().map { s -> s.name + ":" + s.age }
        .forEach { str -> println("combination is " + str) }

    println("The oldest student : ${students.maxByOrNull { it.age }}")
    println("Long studentsWithLongNames: " + students.filter { it.name.length > 5 })

    val myCounter1 = closureMaker()
    val myCounter2 = closureMaker()
    myCounter1()
    myCounter1()
    myCounter1()
    myCounter1()
    myCounter2()
    myCounter2()
    myCounter1()

    sequences()

    val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")
    println(strings.filter(oddLength))

    val strong: (String, String, String) -> String = { body, id, style -> "id=\"$id\" style=\"$style\" body=$body" }
    val curriedStrong: (style: String) -> (id: String) -> (body: String) -> String = strong.reverse().curried()
    val greenStrong: (id: String) -> (body: String) -> String = curriedStrong("color:green")
    val uncurriedGreenStrong: (id: String, body: String) -> String = greenStrong.uncurried()
    println(greenStrong("movie5")("Green Inferno"))
    println(uncurriedGreenStrong("movie6", "Green Hornet"))

    val sum3ints = {x: Int, y: Int, z: Int -> x + y + z}
    val curried: (Int) -> (Int) -> (Int) -> Int = sum3ints.curried()
    val cur = curried(2)(4)(6)
    println("curried(2)(4)(6) = $cur")
}

fun isOdd(x: Int) = x % 2 != 0
fun length(s: String) = s.length

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

fun closureMaker(): () -> Unit {
    var num = 0
    return { println(num++) }
}

fun sequences() {
    val students = getStudents()
    val sqStudents = students.drop(1).take(3).toList()
    println("Sequenced Students: " + sqStudents)

    val numbers = generateSequence(100) { it + 1 }
    println("Numbers: " + numbers.drop(5).take(20).toList())

    val squares = generateSequence(1) { it + 1 }.map { it * it }
    val evenSquares = squares.filter { it % 2 == 0 }
    println("Even Squares: " + evenSquares.take(5).toList())

    val fib = generateSequence(1 to 1) { it.second to it.first + it.second }.map { it.first }
    println("Fibonacci: " + fib.take(15).toList())
}

fun functional() {
    val add5 = {i: Int -> i + 5}
    val multiplyBy2 = {i: Int -> i * 2}

    val sum3ints = {x: Int, y: Int, z: Int -> x + y + z}
    val curried: (Int) -> (Int) -> (Int) -> Int = sum3ints.curried()
    val cur = curried(2)(4)(6)
    println("curried(2)(4)(6) = $cur")
}
