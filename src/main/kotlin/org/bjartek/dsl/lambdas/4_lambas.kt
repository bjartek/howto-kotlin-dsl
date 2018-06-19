package org.bjartek.dsl.lambdas


//A lambda to create the person
fun personLambda(block: (Person) -> Unit): Person = Person().apply(block)


//You do not need parantheses around the last argument if it is an lambda
val p1 = personLambda({
    it.name="Bjarte Stien Karlsen"
})


val p2 = personLambda{
    it.name="Bjarte Stien Karlsen"
}
