package year2021.day03

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Day03KtTest {

  @Test
  fun day03Puzzle1() {
    val actual = day03Puzzle1(
      listOf(
        "00100",
        "11110",
        "10110",
        "10111",
        "10101",
        "01111",
        "00111",
        "11100",
        "10000",
        "11001",
        "00010",
        "01010"
      )
    )

    assertEquals(198, actual)
  }

  @Test
  fun day03Puzzle2() {
    val actual = day03Puzzle2(
      listOf(
        "00100",
        "11110",
        "10110",
        "10111",
        "10101",
        "01111",
        "00111",
        "11100",
        "10000",
        "11001",
        "00010",
        "01010"
      )
    )

    assertEquals(230, actual)
  }
}