@file:Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")

import java.io.File

fun readLines(resource: String): List<String> = File({}::class.java.getResource(resource).toURI()).readLines()

fun readLinesAsInt(resource: String): List<Int> = readLines(resource).map { it.toInt() }

fun readText(resource: String): String = File({}::class.java.getResource(resource).toURI()).readText()