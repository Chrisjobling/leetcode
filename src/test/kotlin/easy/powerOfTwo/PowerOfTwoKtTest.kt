package easy.powerOfTwo


import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PowerOfTwoKtTest {

    @Test
    fun isPowerOfTwo() {
        assertTrue(isPowerOfTwo(1))
        assertTrue(isPowerOfTwo(16))
        assertFalse(isPowerOfTwo(3))
    }
}