package p02_classesAndFunctions.t99_OmitReturnTypes.bad

import p02_classesAndFunctions.t99_OmitReturnTypes.IJavaInterface

class KtImpl : IJavaInterface {
    fun getName(): String = "Foo"

    override fun getJavaValue() =
        System.getProperty("java.value")
}
