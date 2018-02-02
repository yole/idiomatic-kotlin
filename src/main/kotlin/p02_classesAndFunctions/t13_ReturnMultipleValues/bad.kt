package p02_classesAndFunctions.t13_ReturnMultipleValues.bad

fun namedNum(): Pair<Int, String> =
    1 to "one"

fun main(args: Array<String>) {
    val pair = namedNum()
    val number = pair.first
    val name = pair.second
}
