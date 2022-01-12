package easy.numJewelsInStones

fun numJewelsInStones(jewels: String, stones: String): Int {
    var response = 0
    jewels.forEach {
        response += stones.filter { x: Char -> x == it }.length
    }
    return response
}