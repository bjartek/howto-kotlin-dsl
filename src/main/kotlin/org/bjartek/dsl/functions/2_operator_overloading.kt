package org.bjartek.dsl.functions


fun main(args: Array<String>) {

    var sum = twoThirds + threeOverTwo
    println("Sum: ${sum.decimal} fraction:$sum")

    println("$two - $twoThirds = ${two - twoThirds}")
    println("$two + $twoThirds = ${two + twoThirds}")
    println("$two * $threeOverTwo = ${two * threeOverTwo}")
    println("$two / $threeOverTwo = ${two / threeOverTwo}")

    if(3 over 2 > 2 over 2) println("Bigger")

    if(1 over 2 <= 2 over 4) println("Smaller or equal")

    val fracRange = (1 over 5)..(5 over 7)
    println(3 over 5 in fracRange)
    for (i in fracRange) {
        println("Next: $i")
    }

    val (a, b) = twoThirds
    println("Destructed sum to: ($a, $b)")
    println("Sum after inc: ${++sum}")
    println("Sum after dec: ${--sum}")
    println("Sum negated: ${-sum}")

}

