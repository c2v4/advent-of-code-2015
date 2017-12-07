package com.c2v4.advent15

fun present(input: String): Int = input.split('x').map { it.toInt() }.let {
    dimensions -> dimensions.mapIndexed({ index, i -> i*dimensions[(index+1)%dimensions.size] })
}.let {
    it.sum()+it.sum()+(it.min()?:0)
}

fun main(args: Array<String>) {
    print("day2.txt".asResource().split('\n').map { it.trim() }.map { present(it) }.sum())
}