package twoSum

/**
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 **/

fun twoSum(nums: IntArray, target: Int): IntArray {
    val result = IntArray(2)
    var resultFound = false
    nums.forEachIndexed { index, i ->
        nums.forEachIndexed { innerIndex, j ->
            if (index != innerIndex && (i + j) == target) {
                result[0] = index;
                result[1] = innerIndex
                resultFound = true
                return result
            }
        }
        if (resultFound) {
            return result
        }
    }
    return result
}