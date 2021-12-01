package year2021

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day01KtTest {

  @Test
  fun day01Puzzle1() {
    val answer = day01Puzzle1(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263))

    assertEquals(7, answer)
  }

  @Test
  fun day01Puzzle2() {
    val answer = day01Puzzle2(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263))

    assertEquals(5, answer)
  }
}