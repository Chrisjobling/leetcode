package easy.plusOne

/**
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
 */

fun plusOne(digits: IntArray): IntArray {
    val last = digits[digits.lastIndex] + 1
    if (last.toString().length > 1) {
        val tempDigits =  digits.toMutableList()
        tempDigits.removeAt(digits.lastIndex)
        last.toString().forEach { it->
           tempDigits.add(tempDigits.size,(it - '0'))
        }
       return tempDigits.toIntArray()
    } else {
        digits[digits.lastIndex] = last
    }
    return digits
}