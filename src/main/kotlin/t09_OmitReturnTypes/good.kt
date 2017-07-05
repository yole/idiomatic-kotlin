package t09_OmitReturnTypes.good

import t09_OmitReturnTypes.IJavaInterface

class KtImpl : IJavaInterface {
    fun getName() = "Foo"

    override fun getJavaValue(): String? =
        System.getProperty("java.value")
}
