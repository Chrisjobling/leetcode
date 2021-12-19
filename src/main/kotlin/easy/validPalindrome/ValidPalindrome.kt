package easy.validPalindrome

import java.util.*

fun isPalindrome(s: String): Boolean {
    var lowercase = s.lowercase(Locale.getDefault()).replace(" ", "")
    if (s == "") {
        return true
    }
    lowercase = Regex("[^A-Za-z0-9 ]").replace(lowercase, "")
    for (i in 0 until lowercase.length / 2) {
        if (lowercase[i] !== lowercase[lowercase.length - 1 - i]) {
            return false
        }
    }
    return true
}