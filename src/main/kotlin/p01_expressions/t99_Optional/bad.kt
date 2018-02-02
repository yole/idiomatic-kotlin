package p01_expressions.t99_Optional.bad

import java.util.*

fun processOptional(x: Optional<String>) {
    val s = x.orElse("Unknown")
    val firstChar = x.flatMap { Optional.ofNullable(it.firstOrNull()) }
}
