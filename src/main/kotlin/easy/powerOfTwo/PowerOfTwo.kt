package easy.powerOfTwo

fun isPowerOfTwo(n: Int): Boolean {
    var x = n.toDouble()
    while (x != 1.0) {
        x /= 2.0
        println(x)
        if (x < 1.0)
            return false
    }
    return true
}