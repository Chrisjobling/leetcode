package easy.isomorphicStrings

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class IsomorphicStringsKtTest {

    @Test
    fun isIsomorphic() {
        assertTrue(isIsomorphic("egg", "add"))
        assertFalse(isIsomorphic("foo", "bar"))
        assertTrue(isIsomorphic("paper", "title"))
    }
}