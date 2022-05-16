package easy.base7

import org.junit.Assert.assertEquals
import org.junit.Test

internal class Base7KtTest {

    @Test
    fun convertToBase7() {
        assertEquals("202", convertToBase7(100))
        assertEquals("-10", convertToBase7(-7))

    }
}