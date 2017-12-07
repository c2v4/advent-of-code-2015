package com.c2v4.advent15

import java.security.MessageDigest

fun mine(input: String, numberOfZeros: Int = 5): Int = generateSequence(0, { it + 1 }).takeWhile {
    !(input + it).md5().startsWith("0".repeat(numberOfZeros))
}.last() + 1


fun String.md5(): String {
    val md = MessageDigest.getInstance("MD5")
    val digested = md.digest(toByteArray())
    return digested.joinToString("") {
        String.format("%02x", it)
    }
}

fun main(args: Array<String>) {
    print(mine("day4.txt".asResource()))
}