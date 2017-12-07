package com.c2v4.advent15

fun deliver(input: String): Int =
        input.toCharArray()
                .map { Direction.from(it) }
                .fold(emptyList<Point>()) { acc, direction ->
                    acc.plus(direction.go(acc.lastOr({ Point(0, 0) })))
                }
                .toSet()
                .size

private fun <E> Iterable<E>.lastOr(supplier: () -> E): E = this.lastOrNull() ?: supplier.invoke()

enum class Direction {
    NORTH, SOUTH, WEST, EAST;

    companion object {
        fun from(char: Char): Direction {
            return when (char) {
                '<' -> WEST
                '>' -> EAST
                '^' -> NORTH
                'v' -> SOUTH
                else -> throw IllegalArgumentException()
            }
        }
    }

    fun go(from: Point): Point {
        return when (this) {
            WEST -> from.copy(x = from.x - 1)
            EAST -> from.copy(x = from.x + 1)
            NORTH -> from.copy(y = from.y + 1)
            SOUTH -> from.copy(y = from.y - 1)
        }
    }
}

data class Point(val x: Int, val y: Int)

fun main(args: Array<String>) {
    print(deliver("day3.txt".asResource()))
}