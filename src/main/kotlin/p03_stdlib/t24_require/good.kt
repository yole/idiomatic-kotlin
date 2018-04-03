package p03_stdlib.t24_require.good

class Person(
    val name: String?,
    val age: Int
)

fun processPerson(person: Person) {
    require(person.age >= 18) { "Adult required" }
}

