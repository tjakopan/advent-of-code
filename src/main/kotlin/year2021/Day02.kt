package year2021

import Puzzle
import year2021.Day02.Instruction.*

class Day02(lines: List<String>? = null) : Puzzle<Int, Int>(2021, 2, lines) {
  override val input: List<Instruction> = this.lines
    .map { line ->
      val instruction = line.split(' ', limit = 2)
      val direction = instruction[0]
      val distance = instruction[1].toInt()
      when (direction) {
        "forward" -> Forward(distance)
        "down" -> Down(distance)
        "up" -> Up(distance)
        else -> throw IllegalArgumentException("Unknown direction $direction.")
      }
    }

  override fun part1(): Int {
    var horizontalPosition = 0
    var depth = 0
    input.forEach {
      when (it) {
        is Forward -> horizontalPosition += it.distance
        is Down -> depth += it.distance
        is Up -> depth -= it.distance
      }
    }
    return horizontalPosition * depth
  }

  override fun part2(): Int {
    var horizontalPosition = 0
    var depth = 0
    var aim = 0
    input.forEach {
      when (it) {
        is Forward -> {
          horizontalPosition += it.distance
          depth += aim * it.distance
        }
        is Down -> aim += it.distance
        is Up -> aim -= it.distance
      }
    }
    return horizontalPosition * depth
  }

  sealed class Instruction(val distance: Int) {
    class Forward(distance: Int) : Instruction(distance)
    class Down(distance: Int) : Instruction(distance)
    class Up(distance: Int) : Instruction(distance)
  }
}

fun main() {
  println(Day02().solve())
}