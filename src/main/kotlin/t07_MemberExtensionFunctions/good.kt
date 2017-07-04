package t07_MemberExtensionFunctions.good

class PhoneBook {
    fun findPhone(name: String) = "1234567"
}

private fun String.isPhoneNumber() = length == 7 && all { it.isDigit() }
