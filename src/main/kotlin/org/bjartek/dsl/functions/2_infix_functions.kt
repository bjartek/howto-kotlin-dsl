package org.bjartek.dsl.functions
//two function defined on Int that can be called in Infix position
infix fun Int.over(denominator: Int) =
        Fraction(this, denominator).normalize

infix fun Int.by(numerator: Int) =
        Fraction(numerator, this).normalize

//we call the function over with 3 as 'this' and 2 as the argument
val threeOverTwo = 3 over 2

val two = 10 over 5
val twoThirds = 3 by 2

fun main(args: Array<String>) {

    println(threeOverTwo)
    println(two)
    println(twoThirds)
}
