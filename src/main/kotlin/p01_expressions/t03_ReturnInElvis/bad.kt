package p01_expressions.t03_ReturnInElvis.bad

class Person(
    val name: String?,
    val age: Int?
)

fun processPerson(person: Person) {
    val name = person.name
    if (name == null)
        throw IllegalArgumentException("Person must have a name")
    val age = person.age
    if (age == null) return

    println("$name: $age")
}

