package com.c2v4.advent15

fun nice(input: String): Boolean = predicates.all { it.invoke(input) }

val predicates = listOf(
        { string: String ->
            string.toCharArray().filter {
                setOf('a', 'e', 'i', 'o', 'u').contains(it)
            }.size > 2
        },
        { string ->
            (1 until string.length).any { string[it] == string[it - 1] }
        },
        { string ->
            setOf("ab", "cd", "pq", "xy").none { string.contains(it) }
        }
)

fun main(args: Array<String>) {
    print("day5.txt".asResource().split('\n').map { it.trim() }.map { nice(it) }.count { it })
}