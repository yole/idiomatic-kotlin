package p02_classesAndFunctions.t99_SmallClasses

class Address(val city: String, val street: String, val zipCode: String)

class Person(val name: String, val address: Address)

class Company(val personnel: List<Person>, val address: Address)