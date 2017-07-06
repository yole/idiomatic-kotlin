package t03_ReturnInElvis.bad

class Person(val name: String?,
             val age: Int?)

fun processPerson(person: Person) {
    if (person.name == null)
        throw IllegalArgumentException("Person must have a name")
    if (person.age == null) return

    println("${person.name}: ${person.age}")
}

