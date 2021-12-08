package easy.palindrome

/**
Given an integer x, return true if x is easy.palindrome integer.

An integer is a easy.palindrome when it reads the same backward as forward. For example, 121 is easy.palindrome while 123 is not.
 */


fun isPalindrome(x: Int): Boolean {
   val stringNumber = x.toString()
    stringNumber.forEachIndexed { index, c ->
        if(c!== stringNumber[(stringNumber.length -1) - index ]){
            return false
        }
        if (index > stringNumber.length){
            return true
        }
    }
return true
}