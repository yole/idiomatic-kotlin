package p01_expressions.t05_LetSafeCall.good

class Person(val name: String, val address: String?)

fun printAddress(person: Person) {
    person.address?.let {
        println(it)
    }
}
