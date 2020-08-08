package com.leetCode;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length() ; i ++){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;
                Character popChar = stack.pop();
                if (c == ')' && popChar != '(')
                    return false;
                if (c == ']' && popChar != '[')
                    return false;
                if (c == '}' && popChar != '{')
                    return false;
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println((new Solution()).isValid("((}("));
    }
}
