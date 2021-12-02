package year2015.day01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import year2015.day01.Direction.Down
import year2015.day01.Direction.Up

internal class Day01KtTest {
  @Test
  fun day01Puzzle1() {
    var input = listOf(Up, Up, Down, Down)
    var actual = day01Puzzle1(input)
    assertEquals(0, actual)

    input = listOf(Up, Down, Up, Down)
    actual = day01Puzzle1(input)
    assertEquals(0, actual)

    input = listOf(Up, Up, Up)
    actual = day01Puzzle1(input)
    assertEquals(3, actual)

    input = listOf(Up, Up, Down, Up, Up, Down, Up)
    actual = day01Puzzle1(input)
    assertEquals(3, actual)

    input = listOf(Down, Down, Up, Up, Up, Up, Up)
    actual = day01Puzzle1(input)
    assertEquals(3, actual)

    input = listOf(Up, Down, Down)
    actual = day01Puzzle1(input)
    assertEquals(-1, actual)

    input = listOf(Down, Down, Up)
    actual = day01Puzzle1(input)
    assertEquals(-1, actual)

    input = listOf(Down, Down, Down)
    actual = day01Puzzle1(input)
    assertEquals(-3, actual)

    input = listOf(Down, Up, Down, Down, Up, Down, Down)
    actual = day01Puzzle1(input)
    assertEquals(-3, actual)
  }

  @Test
  fun day01Puzzle2() {
    var input: List<Direction> = listOf(Down)
    var actual = day01Puzzle2(input)
    assertEquals(1, actual)

    input = listOf(Up, Down, Up, Down, Down)
    actual = day01Puzzle2(input)
    assertEquals(5, actual)
  }
}