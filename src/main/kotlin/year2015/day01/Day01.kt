package year2015.day01

import readText
import year2015.day01.Direction.Down
import year2015.day01.Direction.Up

sealed class Direction {
  object Up : Direction()
  object Down : Direction()
}

fun day01Puzzle1(input: List<Direction>): Int =
  input.sumOf {
    when (it) {
      is Up -> 1 as Int
      is Down -> -1 as Int
    }
  }

fun day01Puzzle2(input: List<Direction>): Int {
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

fun main() {
  val input = readText("year2015/day01/input")
    .map {
      when (it) {
        '(' -> Up
        ')' -> Down
        else -> throw IllegalArgumentException("Unknown direction $it.")
      }
    }
  println(day01Puzzle1(input))
  println(day01Puzzle2(input))
}