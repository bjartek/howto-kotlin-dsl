package org.bjartek.dsl.lambdas



fun main(args: Array<String>) {

    val arthur= character {
        name="Arthur Pendragon"
        weapon {
            name="Excalibur"
        }
    }
    println(arthur)
}
