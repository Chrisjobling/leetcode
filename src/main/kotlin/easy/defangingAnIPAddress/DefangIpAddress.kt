package easy.defangingAnIPAddress

fun defangIPaddr(address: String): String {
    if (address.isEmpty()) {
        return address
    }
    return address.replace(".", "[.]")
}