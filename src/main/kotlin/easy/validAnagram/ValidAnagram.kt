package easy.validAnagram

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }
    //Array for number of letters
    val counts = IntArray(26) { 0 }
    for (i in s.indices) {
        counts[s[i] - 'a']++
        counts[t[i] - 'a']--
    }
    //If not equal the 0 then we know there isnt a match
    for (i in counts)
        if (i != 0)
            return false

    return true
}