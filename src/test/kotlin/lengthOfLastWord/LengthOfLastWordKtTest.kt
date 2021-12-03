package lengthOfLastWord

import org.junit.Test

import org.junit.Assert.*

class LengthOfLastWordKtTest {

    @Test
    fun lengthOfLastWord() {
        assertEquals(5, lengthOfLastWord("Hello World"))
        assertEquals(4, lengthOfLastWord("   fly me   to   the moon  "))
        assertEquals(6, lengthOfLastWord("luffy is still joyboy"))
    }
}