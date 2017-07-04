package t14_TryAsExpressionBody.bad

fun tryParseInt(number: String): Int? {
    try {
        return Integer.parseInt(number)
    }
    catch (e: NumberFormatException) {
        return null
    }
}