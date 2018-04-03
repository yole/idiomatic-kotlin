package p02_classesAndFunctions.t11_Lateinit.bad

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MyTest {
    class State(val data: String)

    private var state: State? = null

    @Before
    fun setup() {
        state = State("abc")
    }

    @Test
    fun foo() {
        Assert.assertEquals("abc", state!!.data)
    }
}
