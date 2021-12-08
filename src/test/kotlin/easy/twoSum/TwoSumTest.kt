package easy.twoSum

import org.junit.Test

import kotlin.test.assertContentEquals

class TwoSumTest {

    @Test
    fun twoSumShouldReturnIndicesOfTwoNumbersThatAddUp() {
        assertContentEquals(intArrayOf(0,1),twoSum(intArrayOf(2,7,11,15) , 9).sortedArray())
        assertContentEquals(intArrayOf(1,2),twoSum(intArrayOf(3,2,4) , 6).sortedArray())
       assertContentEquals(intArrayOf(0,1),twoSum(intArrayOf(3,3) , 6).sortedArray())
    }
}