package t13_WhenAsExpressionBody.good

fun parseEnglishNumber(number: String) = when (number) {
    "one" -> 1
    "two" -> 2
    else -> null
}