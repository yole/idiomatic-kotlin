package p02_classesAndFunctions.t16_DataClassCopy.good

data class Person(val name: String, val age: Int)

fun happyBirthday(person: Person) =
    person.copy(age = person.age + 1)
