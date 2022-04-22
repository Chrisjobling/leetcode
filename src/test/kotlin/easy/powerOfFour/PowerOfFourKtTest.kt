package easy.powerOfFour

import org.junit.Test

import org.junit.Assert.*

class PowerOfFourKtTest {

    @Test
    fun isPowerOfFour() {
        assertTrue(isPowerOfFour(16))
        assertTrue(isPowerOfFour(1))
        assertFalse(isPowerOfFour(5))
    }
}