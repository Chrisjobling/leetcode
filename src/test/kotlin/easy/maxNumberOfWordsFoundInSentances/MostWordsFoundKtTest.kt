package easy.maxNumberOfWordsFoundInSentances

import org.junit.Test

import org.junit.Assert.*

class MostWordsFoundKtTest {

    @Test
    fun mostWordsFound() {
        assertEquals(6,mostWordsFound(arrayOf("alice and bob love leetcode", "i think so too", "this is great thanks very much")))
        assertEquals(3,mostWordsFound(arrayOf("please wait", "continue to fight", "continue to win")))

    }
}