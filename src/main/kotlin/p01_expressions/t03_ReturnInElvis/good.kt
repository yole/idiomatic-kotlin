package p01_expressions.t03_ReturnInElvis.good

class Person(
    val name: String?,
    val age: Int?
)

fun processPerson(person: Person) {
    val name = person.name ?: throw IllegalArgumentException("Person must have a name")
    val age = person.age ?: return

    println("$name: $age")
}
