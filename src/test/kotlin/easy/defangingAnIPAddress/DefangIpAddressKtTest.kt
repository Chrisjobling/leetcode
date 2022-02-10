package easy.defangingAnIPAddress

import org.junit.Test

import org.junit.Assert.*

class DefangIpAddressKtTest {

    @Test
    fun defangIPaddr() {
        assertEquals("1[.]1[.]1[.]1", defangIPaddr(address = "1.1.1.1"))
        assertEquals("255[.]100[.]50[.]0", defangIPaddr(address = "255.100.50.0"))
    }
}