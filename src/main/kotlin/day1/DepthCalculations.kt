package day1

internal fun isNewDepthDeeper(previousDepth: Int?, newDepth: Int) = when (previousDepth) {
    null -> false
    else -> newDepth.toInt() > previousDepth
}