package t11_ReturnMultipleValues.good

data class NamedNumber(val number: Int,
                       val name: String)

fun returnMultipleValues() =
    NamedNumber(1, "one")

fun main(args: Array<String>) {
    val (number, name) = returnMultipleValues()
}
