package com.browse.blind75.day1;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{}[](]";
        System.out.println(parenthesisChecker(s));
    }

    private static boolean parenthesisChecker(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='{'|| c=='[' || c== '(') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) return false;
            switch(c){
                case '}':
                    if (stack.peek() == '(' || stack.peek() == '[' ) return false;
                    else stack.pop();
                    break;
                case ')':
                    if (stack.peek() == '{' || stack.peek() == '[' ) return false;
                    else stack.pop();
                    break;
                case ']':
                    if (stack.peek() == '(' || stack.peek() == '{' ) return false;
                    else stack.pop();
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}
