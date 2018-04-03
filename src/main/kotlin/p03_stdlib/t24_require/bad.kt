package p03_stdlib.t24_require.bad

class Person(
    val name: String?,
    val age: Int
)

fun processPerson(person: Person) {
    if (person.age < 18) {
        throw IllegalArgumentException("Adult required")
    }
}

