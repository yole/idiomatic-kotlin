package p01_expressions.t01_WhenAsExpressionBody.bad

fun parseEnglishNumber(number: String): Int? {
    when (number) {
        "one" -> return 1
        "two" -> return 2
        else -> return null
    }
}