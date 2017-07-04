package t07_MemberExtensionFunctions.bad

class PhoneBook {
    fun String.isPhoneNumber() = length == 7 && all { it.isDigit() }

    fun PhoneBook.findPhone(name: String) = "1234567"
}
