package p01_expressions.t01a_WhenSealedClass.bad

abstract class Result

class Success : Result()
class Failure(val message: String) : Result()

fun handleResult(result: Result) =
    when (result) {
        is Success -> "OK!"
        is Failure -> "Failed: ${result.message}"
        else -> throw IllegalArgumentException()
    }
