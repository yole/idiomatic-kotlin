package p02_classesAndFunctions.t13_ReturnMultipleValues.good

data class NamedNumber(
    val number: Int,
    val name: String
)

fun namedNum() =
    NamedNumber(1, "one")

fun main(args: Array<String>) {
    val (number, name) = namedNum()
}
