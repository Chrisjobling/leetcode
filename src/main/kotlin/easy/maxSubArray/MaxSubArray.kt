package easy.maxSubArray

fun maxSubArray(nums: IntArray): Int {
    var currentSum = 0
    var maxSum = Int.MIN_VALUE
    if (nums.size == 1) return nums[0]
    for (i in nums.indices) {
        currentSum += nums[i]
        maxSum = maxSum.coerceAtLeast(currentSum)
        if (currentSum < 0) currentSum = 0
    }
    return maxSum
}