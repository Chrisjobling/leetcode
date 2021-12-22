package easy.concatenationOfArray

//fun getConcatenation(nums: IntArray): IntArray {
//    val tempList = nums.toMutableList()
//    nums.toMutableList().forEach { tempList.add(it) }
//    return tempList.toIntArray()
//}

fun getConcatenation(nums: IntArray): IntArray {
    val newIntArray = IntArray(nums.size * 2)
    nums.forEachIndexed { index, i ->
        newIntArray[index] = i
        newIntArray[(nums.size) + index] = i
    }
    return newIntArray
}