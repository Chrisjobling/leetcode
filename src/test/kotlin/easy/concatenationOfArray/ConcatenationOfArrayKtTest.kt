package easy.concatenationOfArray

import org.junit.Test

import org.junit.Assert.*
import kotlin.test.assertContentEquals

class ConcatenationOfArrayKtTest {

    @Test
    fun getConcatenation() {
        assertContentEquals(intArrayOf(1,2,1,1,2,1), getConcatenation(intArrayOf(1,2,1)))
        assertContentEquals(intArrayOf(1,3,2,1,1,3,2,1), getConcatenation(intArrayOf(1,3,2,1)))
    }
}