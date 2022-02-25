package medium.longestSubstringWithoutRepeatingCharacters

import org.junit.Assert.assertEquals
import org.junit.Test

class LongestSubstringWithoutRepeatingCharactersKtTest {

    @Test
    fun lengthOfLongestSubstring() {
        assertEquals(3, lengthOfLongestSubstring(s = "abcabcbb"))
        assertEquals(1, lengthOfLongestSubstring(s = "bbbbb"))
        assertEquals(3, lengthOfLongestSubstring(s = "pwwkew"))
        assertEquals(1, lengthOfLongestSubstring(s = " "))
        assertEquals(2, lengthOfLongestSubstring(s = "au"))
    }
}