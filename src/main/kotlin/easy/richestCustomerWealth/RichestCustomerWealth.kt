package easy.richestCustomerWealth

class RichestCustomerWealth {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        if (accounts.isEmpty()) {
            return 0
        }
        var largestWealth = 0
        accounts.forEach {
            var temp = 0
            it.forEach { x ->
                temp += x
            }
            if (temp > largestWealth) {
                largestWealth = temp
            }
        }
        return largestWealth
    }
}