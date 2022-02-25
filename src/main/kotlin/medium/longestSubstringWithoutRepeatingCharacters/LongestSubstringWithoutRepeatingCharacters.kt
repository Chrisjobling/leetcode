package medium.longestSubstringWithoutRepeatingCharacters

fun lengthOfLongestSubstring(s: String): Int {
    var max = 0
    var substring = ""
    for(i in s.indices){
        if(substring.contains(s[i])){
            substring = substring.split(s[i])[1]
        }
        substring += s[i]
        if(max< substring.length){
            max = substring.length
        }
    }
    return max
}
