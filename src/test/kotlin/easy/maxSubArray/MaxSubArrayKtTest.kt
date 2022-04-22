package easy.maxSubArray

import org.junit.Assert.assertEquals
import org.junit.Test

class MaxSubArrayKtTest {

    @Test
    fun maxSubArray() {
        assertEquals(6, maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
        assertEquals(1, maxSubArray(intArrayOf(1)))
        assertEquals(23, maxSubArray(intArrayOf(5, 4, -1, 7, 8)))
    }
}