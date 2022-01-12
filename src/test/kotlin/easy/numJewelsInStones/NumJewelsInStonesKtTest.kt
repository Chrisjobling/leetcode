package easy.numJewelsInStones

import org.junit.Test

import org.junit.Assert.*

class NumJewelsInStonesKtTest {

    @Test
    fun numJewelsInStones() {
        assertEquals(3,numJewelsInStones(jewels = "aA", stones = "aAAbbbb"))
        assertEquals(0,numJewelsInStones(jewels = "z", stones = "ZZ"))
    }
}