package p02_classesAndFunctions.t05_ToplevelFunctions.bad

class StringUtils {
    companion object {
        fun isPhoneNumber(s: String) =
            s.length == 7 && s.all { it.isDigit() }
    }
}
