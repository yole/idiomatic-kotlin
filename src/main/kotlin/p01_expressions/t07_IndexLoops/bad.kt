package p01_expressions.t07_IndexLoops.bad

fun main(args: Array<String>) {
    for (i in 0..args.size - 1) {
        println("$i: ${args[i]}")
    }
}
