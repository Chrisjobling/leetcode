package easy.canPlaceFlowers

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var tempN = 0
    var i = 0
    while (i < flowerbed.size) {
        if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
            && (i == flowerbed.size - 1 || flowerbed[i + 1] == 0)
        ) {
            tempN++;
        }
        i++
    }
    return tempN >= n
}