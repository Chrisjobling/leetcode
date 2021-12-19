package easy.singleNumber

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
*/
fun singleNumber(nums: IntArray): Int {
    for (element in nums) {
        if(nums.filter {x -> x == element }.size == 1){
            return element
        }
    }
    return 1
}