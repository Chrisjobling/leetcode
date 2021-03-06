package easy.powerOfTwo

fun isPowerOfTwo(n: Int): Boolean {
    var x = n.toDouble()
    while (x != 1.0) {
        x /= 2.0
        if (x < 1.0)
            return false
    }
    return true
}