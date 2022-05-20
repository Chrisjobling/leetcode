package easy.prefixOfAString

import org.junit.Assert.assertEquals
import org.junit.Test

class CountPrefixesofaGivenStringKtTest {

    @Test
    fun countPrefixes() {
        assertEquals(3, countPrefixes(words = arrayOf("a", "b", "c", "ab", "bc", "abc"), s = "abc"))
//        assertEquals(2, countPrefixes(words = arrayOf("a", "a"), s = "aa"))
//        assertEquals(4, countPrefixes(words = arrayOf("e", "s", "mi", "e", "ia", "ibwu", "e", "e", "k", "ci", "rip", "suw", "a", "l"), s = "e")


    }
}