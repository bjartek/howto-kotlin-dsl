package org.bjartek.dsl.functions

//Inspired from https://github.com/s1monw1/kotlin-samples
//https://kotlinexpertise.com/kotlin-conventions-operator-overloading/

data class Fraction(val numerator: Int, val denominator: Int) : Comparable<Fraction> {

   val decimal by lazy { numerator.toDouble() / denominator }

    //override the behavor of + - + /
    operator fun plus(add: Fraction): Fraction {
        return if (this.denominator == add.denominator) Fraction(this.numerator + add.numerator, denominator)
        else {
            val a = this * add.denominator
            val b = add * this.denominator
            Fraction(a.numerator + b.numerator, a.denominator).normalize
        }
    }

    operator fun minus(subtract: Fraction): Fraction {
        return if (this.denominator == subtract.denominator) Fraction(this.numerator - subtract.numerator, denominator)
        else {
            val a = this * subtract.denominator
            val b = subtract * this.denominator
            Fraction(a.numerator - b.numerator, a.denominator).normalize
        }
    }

    operator fun times(other: Fraction) =
            Fraction(numerator * other.numerator, denominator * other.denominator).normalize

    operator fun div(div: Fraction) = this * Fraction(div.denominator, div.numerator)


    //Make it comparable
    override fun compareTo(other: Fraction) = decimal.compareTo(other.decimal)

    //customize the toString
    override fun toString() = "$numerator/$denominator"


    //support incrementor and decrementor
    operator fun dec() = Fraction(this.numerator - 1, this.denominator).normalize

    operator fun inc() = Fraction(this.numerator + 1, this.denominator).normalize

    //Handle when class is called as a function
    operator fun invoke(prefix: String = "") = println("$prefix Fraction=${toString()} Decimal=${decimal}")

    val normalize by lazy {
        val gcd = numerator.gcd(denominator)
        Fraction(numerator / gcd, denominator / gcd)
    }

    operator fun unaryMinus() = Fraction(-this.numerator, this.denominator)

    operator fun times(num: Int) = Fraction(numerator * num, denominator * num)
}


operator fun ClosedRange<Fraction>.iterator() =
        object : Iterator<Fraction> {
            var curr: Fraction = start
            override fun hasNext() = curr <= endInclusive
            override fun next() = curr++

        }

