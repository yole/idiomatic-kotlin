package p03_stdlib.t21_CompareBy.bad

class Person(
    val name: String,
    val age: Int
)

fun sortPersons(persons: List<Person>) =
    persons.sortedWith(Comparator<Person> { person1, person2 ->
        val rc = person1.name.compareTo(person2.name)
        if (rc != 0)
            rc
        else
            person1.age - person2.age
    })
