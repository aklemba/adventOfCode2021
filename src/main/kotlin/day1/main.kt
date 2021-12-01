package day1

fun main() {
    var numberOfDepthIncreases = 0
    var previousDepth: Int? = null
    getInputAsIntArray().forEach { newDepth ->
        if (isNewDepthDeeper(previousDepth, newDepth)) {
            numberOfDepthIncreases++
        }
        previousDepth = newDepth
    }
    println(numberOfDepthIncreases)
}

