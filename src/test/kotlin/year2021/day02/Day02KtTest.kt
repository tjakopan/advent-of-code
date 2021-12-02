package year2021.day02

import org.junit.jupiter.api.Test
import year2021.day02.Instruction.*
import kotlin.test.assertEquals

internal class Day02KtTest {
  @Test
  fun day02Puzzle1() {
    val actual = day02Puzzle1(listOf(Forward(5), Down(5), Forward(8), Up(3), Down(8), Forward(2)))

    assertEquals(150, actual)
  }

  @Test
  fun day02Puzzle2() {
    val actual = day02Puzzle2(listOf(Forward(5), Down(5), Forward(8), Up(3), Down(8), Forward(2)))

    assertEquals(900, actual)
  }
}