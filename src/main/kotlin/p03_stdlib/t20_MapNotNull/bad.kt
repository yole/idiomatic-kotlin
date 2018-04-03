package p03_stdlib.t20_MapNotNull.bad

data class Result(
    val data: Any?,
    val error: String?
)

fun listErrors(results: List<Result>): List<String> =
    results.map { it.error }.filterNotNull()


