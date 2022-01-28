package easy.validAnagram

import org.junit.Test

import org.junit.Assert.*

class ValidAnagramKtTest {

    @Test
    fun isAnagram() {
        assertTrue(isAnagram(s = "anagram", t = "nagaram"))
        assertFalse(isAnagram(s = "rat", t = "car"))
        assertFalse(isAnagram(s = "a", t = "ab"))
        assertFalse(isAnagram(s = "aacc", t = "ccac"))
    }
}