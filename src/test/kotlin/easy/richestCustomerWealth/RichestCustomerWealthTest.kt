package easy.richestCustomerWealth

import org.junit.Test

import org.junit.Assert.*

class RichestCustomerWealthTest {

    @Test
    fun maximumWealth() {
        assertEquals(6, RichestCustomerWealth().maximumWealth(accounts = arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1))))
        assertEquals(10, RichestCustomerWealth().maximumWealth(accounts = arrayOf(intArrayOf(1,5), intArrayOf(7,3),intArrayOf(3,5))))
        assertEquals(17, RichestCustomerWealth().maximumWealth(accounts = arrayOf(intArrayOf(2,8,7), intArrayOf(7,1,3),intArrayOf(1,9,5))))
        assertEquals(0, RichestCustomerWealth().maximumWealth(accounts = arrayOf(intArrayOf())))
        assertEquals(1, RichestCustomerWealth().maximumWealth(accounts = arrayOf(intArrayOf(1))))
    }
}