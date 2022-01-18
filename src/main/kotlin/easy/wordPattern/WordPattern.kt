package easy.wordPattern

fun wordPattern(pattern: String, s: String): Boolean {
    val splitList = s.split(" ")
    if (pattern.length != splitList.size) {
        return false
    }
    val letterMap = mutableMapOf<Char, String>()
    pattern.forEachIndexed { index, c ->
        when (letterMap.containsKey(c)) {
            true -> if (letterMap[c] != splitList[index]) return false
            false -> {
                if (letterMap.containsValue(splitList[index])) return false
                letterMap[c] = splitList[index]
            }
        }
    }
    return true
}
