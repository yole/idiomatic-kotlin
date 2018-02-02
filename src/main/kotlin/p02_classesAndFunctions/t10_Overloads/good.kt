package p02_classesAndFunctions.t10_Overloads.good

import p02_classesAndFunctions.t10_Overloads.bad.Phonebook

class Phonebook {
    fun print(columnSeparator: String = ",") {
    }
}

fun main(args: Array<String>) {
    Phonebook().print(columnSeparator = "|")
}

