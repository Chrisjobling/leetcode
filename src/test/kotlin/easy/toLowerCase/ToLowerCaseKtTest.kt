package easy.toLowerCase

import org.junit.Test

import org.junit.Assert.*

class ToLowerCaseKtTest {

    @Test
    fun toLowerCase() {
        assertEquals("hello", toLowerCase("Hello"))
        assertEquals("here", toLowerCase("here"))
        assertEquals("lovely", toLowerCase("LOVELY"))
    }
}