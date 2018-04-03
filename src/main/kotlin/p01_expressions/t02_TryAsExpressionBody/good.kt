package p01_expressions.t02_TryAsExpressionBody.good

fun tryParseInt(number: String) =
    try {
        Integer.parseInt(number)
    } catch (e: NumberFormatException) {
        null
    }
