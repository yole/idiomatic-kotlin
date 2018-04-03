package p01_expressions.t07_IndexLoops.good

fun main(args: Array<String>) {
    for (i in 0 until args.size) {
        println("$i: ${args[i]}")
    }
}
