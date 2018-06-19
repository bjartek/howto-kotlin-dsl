package org.bjartek.dsl.functions


fun main(args: Array<String>) {

    //We overload the + operator on our own class
    var sum = twoThirds + threeOverTwo


    //Specify what will happen if we call a variable of a class as a function
    sum("My Fraction Is:")

    println("Sum: ${sum.decimal} fraction:$sum")

    println("$two - $twoThirds = ${two - twoThirds}")
    println("$two + $twoThirds = ${two + twoThirds}")
    println("$two * $threeOverTwo = ${two * threeOverTwo}")
    println("$two / $threeOverTwo = ${two / threeOverTwo}")


    //Comparator
    if(3 over 2 > 2 over 2) println("Bigger")

    if(1 over 2 <= 2 over 4) println("Smaller or equal")

    //iterator and rangeTo
    val fracRange = (1 over 5)..(5 over 7)
    println(3 over 5 in fracRange)
    for (i in fracRange) {
        println("Next: $i")
    }

    //Destructuring
    val (a, b) = twoThirds
    println("Destructed sum to: ($a, $b)")

}

