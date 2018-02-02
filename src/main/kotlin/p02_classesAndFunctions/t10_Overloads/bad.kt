package p02_classesAndFunctions.t10_Overloads.bad

class Phonebook {
    fun print() {
        print(",")
    }

    fun print(columnSeparator: String) {
    }
}

fun main(args: Array<String>) {
    Phonebook().print("|")
}
