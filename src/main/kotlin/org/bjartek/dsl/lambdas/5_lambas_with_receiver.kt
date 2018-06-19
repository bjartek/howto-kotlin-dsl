package org.bjartek.dsl.lambdas


//A lambda with receiver. The context of the block is a Person
fun person(block: Person.() -> Unit): Person = Person().apply(block)

//Example of lambda with receiver that has a extra argument infront
fun person(name: String, block: Person.() -> Unit): Person =
        Person(name = name).apply(block)

fun Person.address(block: Address.() -> Unit) {
    address = Address().apply(block)
}

val p3  = person {
    name = "Bjarte Stien Karlsen"
    age = 40
    //conditional logic can be used in here.
    if(true) {
        address {
            street = "Lofthusveien"
            number = 77
            city = "Lillesand"
        }
    }
}

val p4 = person("Bjarte Stien Karlsen") {
    age = 40
    address {
        street = "Lofthusveien"
        number = 77
        city = "Lillesand"

        //However the things below should not be allowed
        name="asf"
        address {
            name= "uhOh"
        }
    }
}

fun main(args: Array<String>) {

   println(p4)
}
