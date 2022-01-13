package easy.decryptStringFromAlphabetToIntegerMapping

import org.junit.Assert.assertEquals
import org.junit.Test

class StringFromAlphabetKtTest {

    @Test
    fun freqAlphabets() {
        assertEquals("jkab", freqAlphabets("10#11#12"))
        assertEquals("acz", freqAlphabets("1326#"))
    }
}