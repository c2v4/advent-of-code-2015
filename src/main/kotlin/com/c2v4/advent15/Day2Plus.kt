package com.c2v4.advent15

fun present2(input: String): Int = input.split('x').map { it.toInt() }.sorted().let {
    it.take(2).sum()*2+it.product()
}

private fun Iterable<Int>.product(): Int = this.reduce { acc, t -> acc*t }

fun main(args: Array<String>) {
    print("day2.txt".asResource().split('\n').map { it.trim() }.map { present2(it) }.sum())
}