package easy.allABeforeB

import org.junit.Test

import org.junit.Assert.*

class AllAsBeforeBsKtTest {

    @Test
    fun checkString() {
        assertTrue(checkString("aaabbb"))
        assertFalse(checkString("abab"))
        assertTrue(checkString("bbb"))
    }
}