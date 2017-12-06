package com.c2v4.advent15

import org.assertj.core.api.Assertions.assertThat
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object Day1Spec : Spek({
    given("Santa is trying to deliver presents in a large apartment building, but he can't find the right floor - the directions he got are a little confusing. He starts on the ground floor (floor 0) and then follows the instructions one character at a time.\n" +
            "\n" +
            "An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ), means he should go down one floor.\n" +
            "\n" +
            "The apartment building is very tall, and the basement is very deep; he will never find the top or bottom floors.") {
        on("(())") {
            it("results in 0") {
                assertThat(floors("(())")).isEqualTo(0)
            }
        }
        on("()()") {
            it("results in 0") {
                assertThat(floors("(())")).isEqualTo(0)
            }
        }
        on("(((") {
            it("results in 3") {
                assertThat(floors("(((")).isEqualTo(3)
            }
        }
        on("(()(()(") {
            it("results in 3") {
                assertThat(floors("(()(()(")).isEqualTo(3)
            }
        }
        on("))(((((") {
            it("results in 3") {
                assertThat(floors("))(((((")).isEqualTo(3)
            }
        }
        on("())") {
            it("results in -1") {
                assertThat(floors("())")).isEqualTo(-1)
            }
        }
        on("))(") {
            it("results in -1") {
                assertThat(floors("))(")).isEqualTo(-1)
            }
        }
        on(")))") {
            it("results in -3") {
                assertThat(floors(")))")).isEqualTo(-3)
            }
        }
        on(")())())") {
            it("results in -3") {
                assertThat(floors(")())())")).isEqualTo(-3)
            }
        }
    }
})