package t10_Overloads.good

import t10_Overloads.bad.Phonebook

class Phonebook {
    fun print(columnSeparator: String = ",") {
    }
}

fun main(args: Array<String>) {
    Phonebook().print(columnSeparator = "|")
}

