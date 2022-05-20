package easy.prefixOfAString

fun countPrefixes(words: Array<String>, s: String): Int {
    var count=0
    words.forEach {
        if(s.indexOf(it)==0){
            count++
        }
    }
    return count
}