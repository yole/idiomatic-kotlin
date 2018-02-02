package p01_expressions.t02_TryAsExpressionBody.good2

fun tryParseInt(number: String): Int? {
    val n = try {
        Integer.parseInt(number)
    } catch (e: NumberFormatException) {
        null
    }
    println(n)
    return n
}