package t09_OmitReturnTypes.bad

import t09_OmitReturnTypes.IJavaInterface

class KtImpl : IJavaInterface {
    fun getName(): String = "Foo"

    override fun getJavaValue() = System.getProperty("java.value")
}
