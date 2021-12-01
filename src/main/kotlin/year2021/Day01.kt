package year2021

import readLinesAsInt

fun day01Puzzle1(input: List<Int>): Int =
  input.zipWithNext()
    .count { (a, b) -> b > a }

fun day01Puzzle2(input: List<Int>): Int =
  day01Puzzle1(
    input.windowed(3, 1) { window -> window.sum() }
  )

fun main() {
  val input = readLinesAsInt("year2021/day01")
  println(day01Puzzle1(input))
  println(day01Puzzle2(input))
}