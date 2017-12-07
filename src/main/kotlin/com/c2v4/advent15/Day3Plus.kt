package com.c2v4.advent15

fun deliver2(input: String): Int =
        input.toCharArray()
                .map { Direction.from(it) }
                .mapIndexed { index, direction -> direction to index.isOdd() }
                .partition { it.second }
                .let { it.first.map { it.first } to it.second.map { it.first } }
                .let {
                    move(it.first) to move(it.second)
                }
                .let { it.first.plus(it.second) }.size


private fun move(moves: List<Direction>): Set<Point> =
        moves.fold(listOf(Point(0, 0)))
        { acc, direction -> acc.plus(direction.go(acc.last())) }.toSet()


private fun Int.isOdd(): Boolean = this % 2 == 0


fun main(args: Array<String>) {
    print(deliver2("day3.txt".asResource()))
}