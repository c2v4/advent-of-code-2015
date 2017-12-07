package com.c2v4.advent15

import org.assertj.core.api.Assertions
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on

object Day2PlusSpec : Spek({
    given("The ribbon required to wrap a present is the shortest distance around its sides, or the smallest perimeter of any one face. Each present also requires a bow made out of ribbon as well; the feet of ribbon required for the perfect bow is equal to the cubic feet of volume of the present. Don't ask how they tie the bow, though; they'll never tell.") {
        on("A present with dimensions 2x3x4") {
            it("requires 2+2+3+3 = 10 feet of ribbon to wrap the present plus 2*3*4 = 24 feet of ribbon for the bow, for a total of 34 feet.") {
                Assertions.assertThat(present2("2x3x4")).isEqualTo(34)
            }
        }
        on("A present with dimensions 1x1x10") {
            it("requires 1+1+1+1 = 4 feet of ribbon to wrap the present plus 1*1*10 = 10 feet of ribbon for the bow, for a total of 14 feet.") {
                Assertions.assertThat(present2("1x1x10")).isEqualTo(14)
            }
        }
    }
})