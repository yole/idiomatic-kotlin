package p02_classesAndFunctions.t05_ToplevelFunctions.better

object StringUtils {
    fun isPhoneNumber(s: String) =
        s.length == 7 && s.all { it.isDigit() }
}

