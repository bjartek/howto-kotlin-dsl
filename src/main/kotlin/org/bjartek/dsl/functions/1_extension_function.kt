package org.bjartek.dsl.functions

//A function added to int
fun Int.gcd(other: Int): Int =
        if (other == 0) this
        else other.gcd(this % other)

//We call the 'new' function gcd on an Int
val num = 10.gcd(8)

