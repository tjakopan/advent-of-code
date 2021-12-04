package year2021

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day01KtTest {
  @Test
  fun day01Puzzle1() {
    val input = listOf("199", "200", "208", "210", "200", "207", "240", "269", "260", "263")
    val actual = Day01(input).part1()

    assertEquals(7, actual)
  }

  @Test
  fun day01Puzzle2() {
    val input = listOf("199", "200", "208", "210", "200", "207", "240", "269", "260", "263")
    val actual = Day01(input).part2()

    assertEquals(5, actual)
  }
}