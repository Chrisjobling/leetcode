package validParentheses

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidParenthesesTest {

    @Test
    fun twoSumShouldReturnIndicesOfTwoNumbersThatAddUp() {
        assertFalse(isValid("["))
        assertTrue(isValid("()"))
        assertTrue(isValid("()[]{}"))
        assertFalse(isValid("(]"))
        assertFalse(isValid("([)]"))
        assertTrue(isValid("{[]}"))
        assertTrue(isValid("([])"))

    }
}