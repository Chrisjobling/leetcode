package easy.validPalindrome

import org.junit.Test

import org.junit.Assert.*

class ValidPalindromeKtTest {

    @Test
    fun isPalindrome() {
        assertTrue(isPalindrome("A man, a plan, a canal: Panama"))
        assertFalse(isPalindrome("race a car"))
        assertTrue(isPalindrome(" "))
        assertFalse(isPalindrome("ab"))
    }

}