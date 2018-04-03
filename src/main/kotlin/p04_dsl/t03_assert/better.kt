package p04_dsl.t03_assert.better

import org.junit.Test
import p04_dsl.t03_assert.getLanguageName

infix fun String.should(x: start): StartWrapper = StartWrapper(this)

object start

class StartWrapper(val value: String) {
    infix fun with(prefix: String) {
        if (!value.startsWith(prefix))
            throw AssertionError(
                "String does not start with $prefix: $value"
            )
    }
}

class FooTest {
    @Test
    fun foo() {
        val name = getLanguageName()
        name should start with "Kot"
    }
}
