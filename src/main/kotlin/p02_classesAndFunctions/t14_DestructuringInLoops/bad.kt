package p02_classesAndFunctions.t14_DestructuringInLoops.bad

fun printMap(map: Map<String, String>) {
    for (item in map.entries) {
        println("${item.key} -> ${item.value}")
    }
}
