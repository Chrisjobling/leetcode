package easy.romanToInteger

fun romanToInt(s: String): Int {
    var ans = 0
    var num = 0
    for (i in s.length - 1 downTo 0) {
        when (s[i]) {
            'I' -> num = 1
            'V' -> num = 5
            'X' -> num = 10
            'L' -> num = 50
            'C' -> num = 100
            'D' -> num = 500
            'M' -> num = 1000
        }
        if (4 * num < ans) ans -= num else ans += num
    }
    return ans
}