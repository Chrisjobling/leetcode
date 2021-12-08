package easy.validParentheses

import java.util.*

/**
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 **/

fun isValid(s: String): Boolean {

    var stack = ArrayDeque<Char>()
    stack.sorted()
    for (i in 0 until s.length){
        var x = s[i]
        if(x == '(' || x =='{' || x== '[' ){
            stack.push(x)
        }
        if(stack.isEmpty()){
            return false
        }
        when (x) {
            ')' -> if (!stack.isEmpty() && stack.peek() == '(' ) {stack.pop()}else{return false}
            '}' -> if (!stack.isEmpty() && stack.peek() == '{' ) {stack.pop()}else{return false}
            ']' -> if (!stack.isEmpty() && stack.peek() == '[' ) {stack.pop()}else{return false}
        }
    }

    return stack.isEmpty()

}