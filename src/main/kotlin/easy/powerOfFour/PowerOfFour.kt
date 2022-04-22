package easy.powerOfFour

fun isPowerOfFour(n: Int): Boolean {
    var x = n.toDouble()
    while (x != 1.0) {
        x /= 4.0
        if (x < 1.0)
            return false
    }
    return true
}