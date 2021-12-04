package year2021

import Puzzle

class Day03(lines: List<String>? = null) : Puzzle<Int, Int>(2021, 3, lines) {
  override val input: List<String> = this.lines

  override fun part1(): Int {
    val gamma = gamma(input)
    val epsilon = epsilon(gamma)
    return gamma * epsilon
  }

  private fun gamma(input: List<String>): Int {
    val numberLength = input[0].length
    val counts = IntArray(numberLength)
    input.forEach { line ->
      line.forEachIndexed { i, char ->
        if (char == '1') counts[i]++
      }
    }
    val halfInputSize = (input.size + 1) / 2
    return counts.map {
      when {
        it >= halfInputSize -> '1'
        else -> '0'
      }
    }
      .joinToString("")
      .toInt(2)
  }

  private fun epsilon(gamma: Int): Int {
    val numberLength = gamma.toString(2).length
    val mask = IntArray(numberLength) { 1 }
      .joinToString("")
      .toInt(2)
    return gamma.inv() and mask
  }

  override fun part2(): Int {
    val ogr = rating(input, ::mostCommonBit)
    val csr = rating(input, ::leastCommonBit)
    return ogr * csr
  }

  private fun rating(input: List<String>, bitCriteria: (List<String>, pos: Int) -> Int): Int {
    var list = input
    var pos = 0
    val numberLength = list[0].length
    while (list.size > 1 && pos < numberLength) {
      val bit = bitCriteria(list, pos)
      list = list.filter { it[pos].digitToInt() == bit }
      pos++
    }
    return list.first().toInt(2)
  }

  private fun mostCommonBit(input: List<String>, pos: Int): Int {
    var count = 0
    input.forEach { line ->
      if (line[pos] == '1') count++
    }
    val halfInputSize = (input.size + 1) / 2
    return if (count >= halfInputSize) 1
    else 0
  }

  private fun leastCommonBit(input: List<String>, pos: Int): Int =
    when (mostCommonBit(input, pos)) {
      0 -> 1
      else -> 0
    }
}

fun main() {
  println(Day03().solve())
}