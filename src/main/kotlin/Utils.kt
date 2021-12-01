import java.io.File

fun readLines(resource: String): List<String> = File({}::class.java.getResource(resource).toURI()).readLines()

fun readLinesAsInt(resource: String): List<Int> = readLines(resource).map { it.toInt() }