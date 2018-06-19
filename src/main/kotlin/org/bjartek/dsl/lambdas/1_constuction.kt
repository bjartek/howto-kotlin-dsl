package org.bjartek.dsl.lambdas


//Named parameters on case classes provide a nice view
val p = Person(
        name = "Bjarte Stien Karlsen",
        //if(true) "foobar" However you cannot have logic inside here
        age = 40,
        address = Address(
                street = "Lofthusveien",
                number = 77,
                city = "Lillesand"
        )
)



