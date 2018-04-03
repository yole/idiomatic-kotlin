package p01_expressions.t07_IndexLoops.better

fun main(args: Array<String>) {
    for ((i, arg) in args.withIndex()) {
        println("$i: $arg")
    }
}
