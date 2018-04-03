package p04_dsl.t01_buildString.good

fun helloWorld(): String {
    return buildString {
        append("Hello, ")
        append("World!")
    }
}
