package p01_expressions.t02_TryAsExpressionBody.bad

fun tryParseInt(number: String): Int? {
    try {
        return Integer.parseInt(number)
    } catch (e: NumberFormatException) {
        return null
    }
}