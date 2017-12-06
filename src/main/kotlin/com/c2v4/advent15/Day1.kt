package com.c2v4.advent15

fun floors(input: String): Int = input.toCharArray().map {
        when (it) {
            '(' -> 1
            ')' -> -1
            else -> throw IllegalArgumentException()
        }
    }.sum()



fun main(args: Array<String>) {
    print(floors("day1.txt".asResource()))
}