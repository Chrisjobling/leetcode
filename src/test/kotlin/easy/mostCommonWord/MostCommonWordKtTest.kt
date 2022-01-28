package easy.mostCommonWord

import org.junit.Test

import org.junit.Assert.*

class MostCommonWordKtTest {

    @Test
    fun mostCommonWord() {
        assertEquals("ball", mostCommonWord(paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = arrayOf("hit")))
        assertEquals("a", mostCommonWord(paragraph = "a.", banned = arrayOf()))
    }
}