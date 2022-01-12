package easy.perfectNumber

fun checkPerfectNumber(number: Int): Boolean {
    var factor = 0
    for (i in 1 until number) {
        if (number % i == 0) {
            factor += i
        }
    }
    return factor == number
}