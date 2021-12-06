package strStr

import org.junit.Test
import kotlin.test.assertEquals

class StrStrKtTest {

    @Test
    fun strStr() {
        assertEquals(2, strStr(haystack = "hello", needle = "ll"))
        assertEquals(-1, strStr(haystack = "aaaaa", needle = "bba"))
        assertEquals(0, strStr(haystack = "", needle = ""))
        assertEquals(1, strStr(haystack = "mississippi", needle = "issi"))
    }
}