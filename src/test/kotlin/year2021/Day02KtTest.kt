package year2021

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Day02KtTest {
  @Test
  fun day02Puzzle1() {
    val input = listOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")
    val actual = Day02(input).part1()

    assertEquals(150, actual)
  }

  @Test
  fun day02Puzzle2() {
    val input = listOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")
    val actual = Day02(input).part2()

    assertEquals(900, actual)
  }
}