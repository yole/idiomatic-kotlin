package p04_dsl.t01_buildString.bad

fun helloWorld(): String {
    val sb = StringBuilder()
    sb.append("Hello, ")
    sb.append("World!")
    return sb.toString()
}
