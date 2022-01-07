package easy.isomorphicStrings

fun isIsomorphic(s: String, t: String): Boolean {
    if (s.length <= 1) {
        return true
    }
    val ss = s.split("").filter { it != "" }
    val st = t.split("").filter { it != "" }
    val m: MutableMap<String, String> = mutableMapOf()
    for (i in ss.indices) {
        if (m.containsKey(ss[i])) {
            if (m[ss[i]]!! != st[i]) {
                return false
            }
        } else if (m.containsValue(st[i])) {
            return false
        } else {
            m[ss[i]] = st[i]
        }
    }
    return true
}
