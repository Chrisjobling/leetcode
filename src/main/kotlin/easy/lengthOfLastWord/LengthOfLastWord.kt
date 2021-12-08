package easy.lengthOfLastWord

fun lengthOfLastWord(s: String): Int {
    if (s.isEmpty()) return 0
    val trimmedString = s.trim()
    var count = 0
    for (i in trimmedString.length -1 downTo 0){
        if(trimmedString[i] == ' '){
            return count
        }else {
            count += 1
        }
    }
    return count
}