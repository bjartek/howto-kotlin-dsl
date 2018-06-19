package org.bjartek.dsl.lambdas


fun person(block: Person.() -> Unit): Person = Person().apply(block)

fun Person.address(block: Address.() -> Unit) {
    address = Address().apply(block)
}

val p2 = person {
    //Here we can have statements
    name = "Bjarte Stien Karlsen"
    age = 40
    address {
        street = "Lofthusveien"
        number = 77
        city = "Lillesand"
    }
}