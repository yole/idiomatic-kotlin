package p02_classesAndFunctions.t07_MemberExtensionFunctions.good

class Person(
    val firstName: String,
    val lastName: String
)

val Person.fullName: String
    get() = "$firstName $lastName"
