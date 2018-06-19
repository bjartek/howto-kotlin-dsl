package org.bjartek.dsl.lambdas

//https://proandroiddev.com/writing-dsls-in-kotlin-part-1-7f5d2193f277
data class Person(var name: String? = null,
                  var age: Int? = null,
                  var address: Address? = null
)

data class Address(var street: String? = null,
                   var number: Int? = null,
                   var city: String? = null)

