package containsDuplicate

fun containsDuplicate(nums: IntArray): Boolean {
    val set = HashSet<Int>()
    for (element in nums) {
        if(!set.add(element)){
            return true
        }
    }
    return false
}