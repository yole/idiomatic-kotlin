package t05_ToplevelFunctions.bad

fun isPhoneNumber(s: String) = s.length == 7 && s.all { it.isDigit() }
