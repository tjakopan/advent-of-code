package year2021

import Puzzle

class Day01(lines: List<String>? = null) : Puzzle<Int, Int>(2021, 1, lines) {
  override val input: List<Int> = this.lines.map { it.toInt() }

  override fun part1(): Int =
    input.zipWithNext()
      .count { (a, b) -> b > a }

  override fun part2(): Int =
    input.windowed(3, 1) { window -> window.sum() }
      .zipWithNext()
      .count { (a, b) -> b > a }

}

fun main() {
  println(Day01().solve())
}