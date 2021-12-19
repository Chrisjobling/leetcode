package easy.palindrome

import org.junit.Test

import org.junit.Assert.*

class PalindromeKtTest {

    @Test
    fun isPalindrome() {
        assertTrue(isPalindrome(121))
    }

    @Test
    fun isNotPalindrome() {
        assertFalse(isPalindrome(-121))
        assertFalse(isPalindrome(10))
        assertFalse(isPalindrome(-101))
    }
}