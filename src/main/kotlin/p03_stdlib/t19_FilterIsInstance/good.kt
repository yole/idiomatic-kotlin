package p03_stdlib.t19_FilterIsInstance.good

fun findAllStrings(objects: List<Any>) =
    objects.filterIsInstance<String>()
