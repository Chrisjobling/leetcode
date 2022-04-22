package easy.powerOfThree

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class PowerOfThreeKtTest {

    @Test
    fun isPowerOfThree() {
        assertTrue(isPowerOfThree(27))
        assertTrue(isPowerOfThree(9))
        assertFalse(isPowerOfThree(0))
    }
}
