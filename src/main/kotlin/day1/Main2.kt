package day1


fun main() {
    var numberOfDepthIncreases = 0
    var previousDepth: Int? = null
    getSums().forEach { newDepth ->
        if (isNewDepthDeeper(previousDepth, newDepth)) {
            numberOfDepthIncreases++
        }
        previousDepth = newDepth
    }
    println(numberOfDepthIncreases)
}

private fun getSums(): ArrayList<Int> {
    val depthMeasurements = getInputAsIntArray()
    val sumsOfThreeMeasurements = ArrayList<Int>()
    run loop@{
        depthMeasurements.withIndex().forEach { currentDepthMeasurement ->
            val sum = getSumOfThreeConsecutiveDepths(depthMeasurements, currentDepthMeasurement.index)
            sumsOfThreeMeasurements.add(sum)
            if (isLastThreeDepths(currentDepthMeasurement, depthMeasurements))
                return@loop
        }
    }
    return sumsOfThreeMeasurements
}

private fun isLastThreeDepths(
    currentDepthMeasurement: IndexedValue<Int>,
    depthMeasurements: IntArray
): Boolean {
    return currentDepthMeasurement.index + 3 >= depthMeasurements.size
}

private fun getSumOfThreeConsecutiveDepths(
    depthMeasurements: IntArray,
    currentDepthMeasurementIndex: Int
): Int {
    return depthMeasurements[currentDepthMeasurementIndex] +
            depthMeasurements[currentDepthMeasurementIndex + 1] +
            depthMeasurements[currentDepthMeasurementIndex + 2]
}