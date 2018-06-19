package org.bjartek.dsl.lambdas

//https://proandroiddev.com/writing-dsls-in-kotlin-part-1-7f5d2193f277

//These classea are mutable, you can make dsl if you want the result to be immutable. See the follow up article to
//the one above
data class Person(
        var name: String? = null,
        var age: Int? = null,
        var address: Address? = null
)
//Optional parameters with default value

data class Address(
        var street: String? = null,
        var number: Int? = null,
        var city: String? = null)

