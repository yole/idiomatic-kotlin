package p01_expressions.t99_Optional.good

fun processOptional(x: String?) {
    val s = x ?: "Unknown"
    val firstChar = x?.firstOrNull()
}
