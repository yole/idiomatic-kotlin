package p01_expressions.t01a_WhenSealedClass.good

sealed class Result

class Success : Result()
class Failure(val message: String) : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> println("OK!")
        is Failure -> println("Failed: ${result.message}")
    }
}