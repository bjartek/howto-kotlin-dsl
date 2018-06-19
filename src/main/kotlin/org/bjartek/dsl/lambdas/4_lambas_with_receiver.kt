package org.bjartek.dsl.lambdas


fun person(block: Person.() -> Unit): Person = Person().apply(block)

fun person(name: String, block: Person.() -> Unit): Person =
        Person(name = name).apply(block)

//Using named parameters
fun person(age: Int, block: Person.() -> Unit): Person =
        Person(age = age).apply(block)

fun Person.address(block: Address.() -> Unit) {
    address = Address().apply(block)
}

//No need for surrounding () on a function if the only parameter is a lambda
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

//The last 'lambda' parameter is called as a block
val p3 = person("Bjarte Stien Karlsen") {
    age = 40
    address {
        street = "Lofthusveien"
        number = 77
        city = "Lillesand"
    }
}

val p4 = person(40) {
    name = "Bjarte Stien Karlsen"
    address {
        street = "Lofthusveien"
        number = 77
        city = "Lillesand"
    }
}