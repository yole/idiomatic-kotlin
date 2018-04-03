package p04_dsl.t03_assert.good

import org.junit.Test
import p04_dsl.t03_assert.getLanguageName

infix fun <T> T.should(verifier: (T) -> Unit) = verifier(this)

fun startWith(prefix: String) = { value: String ->
    if (!value.startsWith(prefix))
        throw AssertionError("String $value does not start with $prefix")
}

class FooTest {
    @Test
    fun foo() {
        val name = getLanguageName()
        name should startWith("Kot")
    }
}
