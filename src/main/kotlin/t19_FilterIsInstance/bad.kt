package t19_FilterIsInstance.bad

fun findAllStrings(objects: List<Any>) =
    objects.filter { it is String }
