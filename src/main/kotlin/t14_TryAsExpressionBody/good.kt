package t14_TryAsExpressionBody.good

fun tryParseInt(number: String) =
    try {
        Integer.parseInt(number)
    }
    catch (e: NumberFormatException) {
        null
    }
