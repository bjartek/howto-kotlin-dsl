package org.bjartek.dsl.lambdas



fun main(args: Array<String>) {

    //Add DSLMarkers to your dsls classes to correct scoping
    val arthur= character {
        name="Arthur Pendragon"
        occupation="King"
        weapon {
            name="Excalibur"
           // occupation="Dead"
            //weapon {  }
        }

    }
    println(arthur)
}
