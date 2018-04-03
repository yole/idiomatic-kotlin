package p02_classesAndFunctions.t07_MemberExtensionFunctions.good

class PhoneBook {
}

private fun String.isPhoneNumber() =
    length == 7 && all { it.isDigit() }
