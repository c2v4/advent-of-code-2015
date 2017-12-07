package com.c2v4.advent15

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object Day3PlusSpec : Spek({
    given("The next year, to speed up the process, Santa creates a robot version of himself, Robo-Santa, to deliver presents with him.\n" +
            "\n" +
            "Santa and Robo-Santa start at the same location (delivering two presents to the same starting house), then take turns moving based on instructions from the elf, who is eggnoggedly reading from the same script as the previous year.\n" +
            "\n" +
            "This year, how many houses receive at least one present?") {
        on("^v") {
            it("delivers presents to 3 houses, because Santa goes north, and then Robo-Santa goes south.") {
                Assertions.assertThat(deliver2("^v")).isEqualTo(3)
            }
        }
        on("^>v<") {
            it("now delivers presents to 3 houses, and Santa and Robo-Santa end up back where they started.") {
                Assertions.assertThat(deliver2("^>v<")).isEqualTo(3)
            }
        }
        on("^v^v^v^v^v") {
            it("now delivers presents to 11 houses, with Santa going one direction and Robo-Santa going the other.") {
                Assertions.assertThat(deliver2("^v^v^v^v^v")).isEqualTo(11)
            }
        }
    }
})