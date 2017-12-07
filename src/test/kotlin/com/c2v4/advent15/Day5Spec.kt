package com.c2v4.advent15

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object Day5Spec : Spek({
    given("A nice string is one with all of the following properties:\n" +
            "\n" +
            "It contains at least three vowels (aeiou only), like aei, xazegov, or aeiouaeiouaeiou.\n" +
            "It contains at least one letter that appears twice in a row, like xx, abcdde (dd), or aabbccdd (aa, bb, cc, or dd).\n" +
            "It does not contain the strings ab, cd, pq, or xy, even if they are part of one of the other requirements.") {
        on("ugknbfddgicrmopn") {
            it("is nice because it has at least three vowels (u...i...o...), a double letter (...dd...), and none of the disallowed substrings.") {
                Assertions.assertThat(nice("ugknbfddgicrmopn")).isEqualTo(true)
            }
        }
        on("aaa") {
            it("is nice because it has at least three vowels and a double letter, even though the letters used by different rules overlap.") {
                Assertions.assertThat(nice("aaa")).isEqualTo(true)
            }
        }
        on("jchzalrnumimnmhp") {
            it("is naughty because it has no double letter.") {
                Assertions.assertThat(nice("jchzalrnumimnmhp")).isEqualTo(false)
            }
        }
        on("haegwjzuvuyypxyu") {
            it("is naughty because it contains the string xy.") {
                Assertions.assertThat(nice("haegwjzuvuyypxyu")).isEqualTo(false)
            }
        }
        on("dvszwmarrgswjxmb") {
            it("is naughty because it contains only one vowel.") {
                Assertions.assertThat(nice("dvszwmarrgswjxmb")).isEqualTo(false)
            }
        }
    }
})