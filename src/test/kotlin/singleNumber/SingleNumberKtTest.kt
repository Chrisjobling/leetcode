package singleNumber

import org.junit.Test

import org.junit.Assert.*

class SingleNumberKtTest {

    @Test
    fun singleNumber() {
        assertEquals(1, singleNumber(intArrayOf(2,2,1)))
        assertEquals(4, singleNumber(intArrayOf(4,1,2,1,2)))
        assertEquals(1, singleNumber(intArrayOf(1)))
    }
}