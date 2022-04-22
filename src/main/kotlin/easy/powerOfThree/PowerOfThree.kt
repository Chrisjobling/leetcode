package easy.powerOfThree

fun isPowerOfThree(n: Int): Boolean {
    var x = n.toDouble()
    while (x != 1.0) {
        x /= 3.0
        if (x < 1.0)
            return false
    }
    return true
}