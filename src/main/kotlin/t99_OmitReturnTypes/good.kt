package t99_OmitReturnTypes.good

import t99_OmitReturnTypes.IJavaInterface

class KtImpl : IJavaInterface {
    fun getName() = "Foo"

    override fun getJavaValue(): String? =
        System.getProperty("java.value")
}
