package year2015

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day01KtTest {
  @Test
  fun day01Puzzle1() {
    var input = listOf("(())")
    var actual = Day01(input).part1()
    assertEquals(0, actual)

    input = listOf("()()")
    actual = Day01(input).part1()
    assertEquals(0, actual)

    input = listOf("(((")
    actual = Day01(input).part1()
    assertEquals(3, actual)

    input = listOf("(()(()(")
    actual = Day01(input).part1()
    assertEquals(3, actual)

    input = listOf("))(((((")
    actual = Day01(input).part1()
    assertEquals(3, actual)

    input = listOf("())")
    actual = Day01(input).part1()
    assertEquals(-1, actual)

    input = listOf("))(")
    actual = Day01(input).part1()
    assertEquals(-1, actual)

    input = listOf(")))")
    actual = Day01(input).part1()
    assertEquals(-3, actual)

    input = listOf(")())())")
    actual = Day01(input).part1()
    assertEquals(-3, actual)
  }

  @Test
  fun day01Puzzle2() {
    var input = listOf(")")
    var actual = Day01(input).part2()
    assertEquals(1, actual)

    input = listOf("()()))")
    actual = Day01(input).part2()
    assertEquals(5, actual)
  }
}