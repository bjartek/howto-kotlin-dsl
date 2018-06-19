package org.bjartek.dsl.lambdas


//A lambda to create the person
fun personLambda(block: (Person) -> Unit): Person = Person().apply(block)

//Example lambda with a parameter infront
fun personLambda(name:String, block: (Person) -> Unit): Person = Person().apply(block)


//You do not need parantheses around the last argument if it is an lambda
val p1 = personLambda({
    it.name="Bjarte Stien Karlsen"
})


val p2 = personLambda{
    it.name="Bjarte Stien Karlsen"
}

//Again same rule apply. You can 'end' the normal function and use a block for the last lambda argument. 
val p3= personLambda("Bjarte Stien Karlsen") {
   it.age=40
}
