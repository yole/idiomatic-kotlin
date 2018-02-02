package p02_classesAndFunctions.t06_ExtensionFunctions.bad

fun isPhoneNumber(s: String) =
    s.length == 7 && s.all { it.isDigit() }
