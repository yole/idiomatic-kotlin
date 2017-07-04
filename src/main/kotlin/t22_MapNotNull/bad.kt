package t22_MapNotNull.bad

data class Result(val data: Any?,
                  val errorMessage: String?)

fun listAllErrorMessages(errors: List<Result>): List<String> =
    errors.map { it.errorMessage }.filterNotNull()


