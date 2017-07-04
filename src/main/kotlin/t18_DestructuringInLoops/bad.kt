package t18_DestructuringInLoops.bad

fun printMap(map: Map<String, String>) {
    for (item in map.entries) {
        println("${item.key} -> ${item.value}")
    }
}
