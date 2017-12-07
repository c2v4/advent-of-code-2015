package com.c2v4.advent15

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object Day4Spec : Spek({
    given("To do this, he needs to find MD5 hashes which, in hexadecimal, start with at least five zeroes. The input to the MD5 hash is some secret key (your puzzle input, given below) followed by a number in decimal. To mine AdventCoins, you must find Santa the lowest positive number (no leading zeroes: 1, 2, 3, ...) that produces such a hash.") {
        on("If your secret key is abcdef") {
            it("the answer is 609043, because the MD5 hash of abcdef609043 starts with five zeroes (000001dbbfa...), and it is the lowest such number to do so.") {
                Assertions.assertThat(mine("abcdef")).isEqualTo(609043)
            }
        }
        on("If your secret key is pqrstuv") {
            it("the lowest number it combines with to make an MD5 hash starting with five zeroes is 1048970; that is, the MD5 hash of pqrstuv1048970 looks like 000006136ef....") {
                Assertions.assertThat(mine("pqrstuv")).isEqualTo(1048970)
            }
        }
    }
})