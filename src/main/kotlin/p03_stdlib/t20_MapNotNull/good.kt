package p03_stdlib.t20_MapNotNull.good

data class Result(
    val data: Any?,
    val errorMessage: String?
)

fun listErrors(results: List<Result>): List<String> =
    results.mapNotNull { it.errorMessage }
