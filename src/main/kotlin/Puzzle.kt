abstract class Puzzle<R1, R2>(year: Int, day: Int, lines: List<String>?) {
  protected val lines: List<String> = lines ?: readLines("year$year/day${"%02d".format(day)}.in")

  protected open val input: Any = this.lines

  abstract fun part1(): R1

  abstract fun part2(): R2

  fun solve(): Pair<R1, R2> = Pair(part1(), part2())
}