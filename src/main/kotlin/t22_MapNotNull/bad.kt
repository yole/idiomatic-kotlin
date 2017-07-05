package t22_MapNotNull.bad

data class Result(val data: Any?,
                  val errorMessage: String?)

fun listAllErrorMessages(results: List<Result>): List<String> =
    results.map { it.errorMessage }.filterNotNull()


