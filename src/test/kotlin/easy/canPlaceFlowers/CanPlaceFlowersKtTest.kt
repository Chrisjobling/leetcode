package easy.canPlaceFlowers

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

//where 0 means empty and 1 means not empty

class CanPlaceFlowersKtTest {

    @Test
    fun canPlaceFlowers() {
        assertTrue(canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 1))
        assertFalse(canPlaceFlowers(intArrayOf(1, 0, 0, 0, 1), 2))
        assertTrue(canPlaceFlowers(intArrayOf(0,0,1,0,0), 1))
    }
}