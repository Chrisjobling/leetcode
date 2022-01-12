package easy.maximum69Number

import org.junit.Test
import kotlin.test.assertEquals

class Maximum69NumberKtTest {

    @Test
    fun maximum69Number() {
        assertEquals(9969,maximum69Number(9669))
        assertEquals(9999,maximum69Number(9996))
        assertEquals(9999,maximum69Number(9999))
    }
}