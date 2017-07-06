package t20_MapNotNull.good

data class Result(val data: Any?,
                  val errorMessage: String?)

fun listAllErrorMessages(results: List<Result>): List<String> =
    results.mapNotNull { it.errorMessage }
