package com.c2v4.advent15

import org.assertj.core.api.Assertions.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object Day1PlusSpec : Spek({
    given("Now, given the same instructions, find the position of the first character that causes him to enter the basement (floor -1). The first character in the instructions has position 1, the second character has position 2, and so on.") {
        on(")") {
            it("causes him to enter the basement at character position 1.") {
                assertThat(floors2(")")).isEqualTo(1)
            }
        }
        on("()())") {
            it("causes him to enter the basement at character position 5.") {
                assertThat(floors2("()())")).isEqualTo(5)
            }
        }
    }
})