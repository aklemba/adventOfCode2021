package day1

import java.io.File

internal fun getInputAsIntArray() = getInputFile().readLines().map { it.toInt() }.toIntArray()

internal fun getInputFile() = File(System.getProperty("user.dir") + INPUT_PATH)

private const val INPUT_PATH = "\\src\\main\\kotlin\\day1\\input"