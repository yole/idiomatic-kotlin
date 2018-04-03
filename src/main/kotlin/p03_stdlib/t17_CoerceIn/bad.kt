package p03_stdlib.t17_CoerceIn.bad

fun updateProgress(value: Int) {
    val actualValue = when {
        value < 0 -> 0
        value > 100 -> 100
        else -> value
    }
}
