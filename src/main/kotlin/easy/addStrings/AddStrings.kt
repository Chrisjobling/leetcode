package easy.addStrings

/*
Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
You must also not convert the inputs to integers directly.
 */

fun addStrings(num1: String, num2: String): String {
    if (num1.isEmpty()) {
        return num2
    }
    if (num2.isEmpty()) {
        return num1
    }
    var len1: Int = num1.length
    var len2: Int = num2.length
    var carry = 0
    var c1: Int
    var c2: Int
    val answer = StringBuilder()
    while (len1 > 0 || len2 > 0 || carry > 0) {
        c1 = if (len1-- > 0) num1[len1] - '0' else 0
        c2 = if (len2-- > 0) num2[len2] - '0' else 0
        val sum = carry + c1 + c2
        carry = sum / 10
        answer.insert(0, sum % 10)
    }
    return answer.toString()
}