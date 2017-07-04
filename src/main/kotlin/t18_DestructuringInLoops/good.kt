package t18_DestructuringInLoops.good

fun printMap(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }
}
