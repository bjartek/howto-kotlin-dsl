package org.bjartek.dsl.lambdas

@DslMarker
annotation class CharacterDsl


@CharacterDsl
data class Character(var name: String? = null,
                     var weapon: Weapon? = null
)

@CharacterDsl
data class Weapon(var name: String? = null)

fun character(block: Character.() -> Unit): Character = Character().apply(block)

fun Character.weapon(block: Weapon.() -> Unit) {
    weapon = Weapon().apply(block)
}