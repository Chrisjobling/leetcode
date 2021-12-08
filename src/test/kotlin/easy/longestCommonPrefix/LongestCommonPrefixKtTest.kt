package easy.longestCommonPrefix

import org.junit.Test

import org.junit.Assert.*

class LongestCommonPrefixKtTest {

    @Test
    fun isLongestCommonPrefix() {
        assertEquals("c",longestCommonPrefix(arrayOf("cir","car")))
        assertEquals("fl",longestCommonPrefix(arrayOf("flower","flow","flight")))
        assertEquals("",longestCommonPrefix(arrayOf("dog","racecar","car")))
    }
}