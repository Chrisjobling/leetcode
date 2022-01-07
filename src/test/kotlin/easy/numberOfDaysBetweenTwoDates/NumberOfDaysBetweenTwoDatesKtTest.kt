package easy.numberOfDaysBetweenTwoDates

import org.junit.Test

import org.junit.Assert.*

class NumberOfDaysBetweenTwoDatesKtTest {

    @Test
    fun daysBetweenDates() {
        assertEquals(1,daysBetweenDates("2019-06-29","2019-06-30"))
        assertEquals(15,daysBetweenDates("2020-01-15","2019-12-31"))

    }
}