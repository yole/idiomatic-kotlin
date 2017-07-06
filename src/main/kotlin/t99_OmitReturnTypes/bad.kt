package t99_OmitReturnTypes.bad

import t99_OmitReturnTypes.IJavaInterface

class KtImpl : IJavaInterface {
    fun getName(): String = "Foo"

    override fun getJavaValue() =
        System.getProperty("java.value")
}
