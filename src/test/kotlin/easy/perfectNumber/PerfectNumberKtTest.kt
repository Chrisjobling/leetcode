package easy.perfectNumber

import org.junit.Test

import org.junit.Assert.*

class PerfectNumberKtTest {

    @Test
    fun checkPerfectNumber() {
        assertTrue(checkPerfectNumber(28))
        assertFalse(checkPerfectNumber(7))
    }
}