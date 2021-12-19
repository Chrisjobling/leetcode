package easy.toLowerCase

fun toLowerCase(s: String): String {
    var temp = ""
    s.forEach {
        if (it.code in 65..90) {
            val tempInt = it.code + 32
            temp = temp.plus(tempInt.toChar().toString())
        } else {
            temp = temp.plus(it)
        }
    }
    return temp
}