package p01_expressions.t01_WhenAsExpressionBody.good

fun parseEnglishNumber(number: String) = when (number) {
    "one" -> 1
    "two" -> 2
    else -> null
}