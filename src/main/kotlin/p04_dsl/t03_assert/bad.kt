package p04_dsl.t03_assert.bad

import org.junit.Assert
import org.junit.Test
import p04_dsl.t03_assert.getLanguageName

class FooTest {
    @Test
    fun foo() {
        val name = getLanguageName()
        Assert.assertTrue(name.startsWith("Kot"))
    }
}
