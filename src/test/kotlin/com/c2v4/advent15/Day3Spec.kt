package com.c2v4.advent15

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object Day3Spec : Spek({
    given("He begins by delivering a present to the house at his starting location, and then an elf at the North Pole calls him via radio and tells him where to move next. Moves are always exactly one house to the north (^), south (v), east (>), or west (<). After each move, he delivers another present to the house at his new location.\n" +
            "\n" +
            "However, the elf back at the north pole has had a little too much eggnog, and so his directions are a little off, and Santa ends up visiting some houses more than once. How many houses receive at least one present?") {
        on(">") {
            it("delivers presents to 2 houses: one at the starting location, and one to the east.") {
                Assertions.assertThat(deliver(">")).isEqualTo(1)
            }
        }
        on("^>v<") {
            it("delivers presents to 4 houses in a square, including twice to the house at his starting/ending location.") {
                Assertions.assertThat(deliver("^>v<")).isEqualTo(4)
            }
        }
        on("^v^v^v^v^v") {
            it("delivers a bunch of presents to some very lucky children at only 2 houses.") {
                Assertions.assertThat(deliver("^v^v^v^v^v")).isEqualTo(2)
            }
        }
    }
})