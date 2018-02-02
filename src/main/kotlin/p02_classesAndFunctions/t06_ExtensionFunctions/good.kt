package p02_classesAndFunctions.t06_ExtensionFunctions.good

fun String.isPhoneNumber() =
    length == 7 && all { it.isDigit() }
