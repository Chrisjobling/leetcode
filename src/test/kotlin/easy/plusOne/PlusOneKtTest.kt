package easy.plusOne

import org.junit.Test
import kotlin.test.assertContentEquals

class PlusOneKtTest {

    @Test
    fun plusOne() {
//        assertContentEquals(intArrayOf(1, 2, 4), plusOne(intArrayOf(1, 2, 3)))
//        assertContentEquals(intArrayOf(4, 3, 2, 2), plusOne(intArrayOf(4, 3, 2, 1)))
//        assertContentEquals(intArrayOf(1), plusOne(intArrayOf(0)))
//        assertContentEquals(intArrayOf(1,0), plusOne(intArrayOf(9)))
        assertContentEquals(intArrayOf(1,0,0), plusOne(intArrayOf(9,9)))
    }
}