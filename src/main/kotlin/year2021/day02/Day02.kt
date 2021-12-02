package year2021.day02

import readLines
import year2021.day02.Instruction.*

sealed class Instruction(val distance: Int) {
  class Forward(distance: Int) : Instruction(distance)
  class Down(distance: Int) : Instruction(distance)
  class Up(distance: Int) : Instruction(distance)
}

fun day02Puzzle1(input: List<Instruction>): Int {
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

fun day02Puzzle2(input: List<Instruction>): Int {
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

fun main() {
  val input = readLines("year2021/day02/input")
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
  println(day02Puzzle1(input))
  println(day02Puzzle2(input))
}