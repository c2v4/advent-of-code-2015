package com.c2v4.advent15

fun floors2(input: String): Int {
    var sum = 0
    input.toCharArray().map {
        when (it) {
            '(' -> 1
            ')' -> -1
            else -> throw IllegalArgumentException()
        }
    }.forEachIndexed { index, i ->
        sum += i
        if (sum < 0) return index + 1
    }
    return 0
}


fun main(args: Array<String>) {
    print(floors2("day1.txt".asResource()))
}