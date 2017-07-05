package t11_ReturnMultipleValues.bad

fun returnMultipleValues(): Pair<Int, String> =
    1 to "one"

fun main(args: Array<String>) {
    val pair = returnMultipleValues()
    val number = pair.first
    val name = pair.second
}
