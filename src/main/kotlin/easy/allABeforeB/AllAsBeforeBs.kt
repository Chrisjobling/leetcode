package easy.allABeforeB

fun checkString(s: String): Boolean {
    if (s.isEmpty()) {
        return true
    }
    if (s.length == 1) {
        return true
    }
    var bFound = false
    s.toCharArray().forEach { c ->
        if (bFound && c == 'a') {
            return false
        }
        if (c == 'b') {
            bFound = true
        }
    }
    return true
}