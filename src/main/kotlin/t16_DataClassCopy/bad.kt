package t16_DataClassCopy.bad

class Person(val name: String, var age: Int)

fun happyBirthday(person: Person) {
    person.age++
}
