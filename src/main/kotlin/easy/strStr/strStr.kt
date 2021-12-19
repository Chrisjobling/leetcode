package easy.strStr

fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty()) {
        return 0
    }
    if (!haystack.contains(needle)) {
        return -1
    }
    var copyHaystack = haystack
    for (i in copyHaystack.indices step needle.length) {
        if (copyHaystack.substring(0, needle.length).contentEquals(needle)) {
            return i
        } else {
            copyHaystack = copyHaystack.drop(needle.length)
        }
    }
    return 0
}