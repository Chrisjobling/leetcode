package easy.decryptStringFromAlphabetToIntegerMapping

fun getAlphabet(number: String) = (96 + number.toInt()).toChar()
fun freqAlphabets(s: String): String {
    var response = ""
    var k = 0
    while (s.length > k) {
        if (s.length > k + 2 && s[k + 2] == '#') {
            response += getAlphabet(s[k].toString() + s[k + 1].toString())
            k += 2
        } else response += getAlphabet(s[k].toString())
        k++
    }
    return response
}