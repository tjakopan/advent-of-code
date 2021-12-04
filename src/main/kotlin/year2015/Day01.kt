package year2015

import Puzzle
import year2015.Day01.Direction.Down
import year2015.Day01.Direction.Up

class Day01(lines: List<String>? = null) : Puzzle<Int, Int>(2015, 1, lines) {
  override val input: List<Direction> =
    this.lines[0].map {
      when (it) {
        '(' -> Up
        ')' -> Down
        else -> throw IllegalArgumentException("Unknown direction $it.")
      }
    }

  override fun part1(): Int =
    input.sumOf {
      when (it) {
        is Up -> 1 as Int
        is Down -> -1 as Int
      }
    }

  override fun part2(): Int {
    var floor = 0
    for (direction in input.withIndex()) {
      floor += when (direction.value) {
        is Up -> 1
        is Down -> -1
      }
      if (floor == -1) return direction.index + 1
    }
    throw IllegalArgumentException("Instructions never lead to floor -1")
  }

  sealed class Direction {
    object Up : Direction()
    object Down : Direction()
  }
}

fun main() {
  println(Day01().solve())
}