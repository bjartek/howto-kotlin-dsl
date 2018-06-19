package org.bjartek.dsl.functions

//A function 'added to int
fun Int.gcd(other: Int): Int =
        if (other == 0) this
        else other.gcd(this % other)

//two function defined on Int that can be called in Infix position
infix fun Int.over(denominator: Int) =
        Fraction(this, denominator).normalize

infix fun Int.by(numerator: Int) =
        Fraction(numerator, this).normalize


val threeOverTwo = 3 over 2
val two = 10 over 5
val twoThirds = 3 by 2

fun main(args: Array<String>) {

    println(threeOverTwo)
    println(two)
    println(twoThirds)
}
