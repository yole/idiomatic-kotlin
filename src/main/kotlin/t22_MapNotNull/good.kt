package t22_MapNotNull.good

data class Result(val data: Any?,
                  val errorMessage: String?)

fun listAllErrorMessages(errors: List<Result>): List<String> =
    errors.mapNotNull { it.errorMessage }
