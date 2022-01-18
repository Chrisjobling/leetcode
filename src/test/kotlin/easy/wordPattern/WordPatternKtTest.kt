package easy.wordPattern

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class WordPatternKtTest {

    @Test
    fun wordPattern() {
        assertTrue(wordPattern(pattern = "abba", s = "dog cat cat dog"))
        assertFalse(wordPattern(pattern = "abba", s = "dog cat cat fish"))
        assertFalse(wordPattern(pattern = "aaaa", s = "dog cat cat dog"))
        assertFalse(wordPattern(pattern = "aaa", s = "aa aa aa aa"))
        assertFalse(wordPattern(pattern = "jquery", s = "jquery"))    }
}