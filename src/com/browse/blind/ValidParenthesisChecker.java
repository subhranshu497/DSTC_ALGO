package com.browse.blind;

import java.util.Stack;

public class ValidParenthesisChecker {
    public static void main(String[] args) {
        String s = "[])";
        System.out.println(parenthesisChecker(s));
    }

    private static boolean parenthesisChecker(String s) {
        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i =0;i<charArr.length;i++){
            if(charArr[i]=='[' || charArr[i]=='{'||charArr[i]=='('){
                stack.push(charArr[i]);
                continue;
            }
            else if(stack.isEmpty()) return false;
            else{
                if(charArr[i]==')' && stack.peek() != '(') return false;
                else if(charArr[i]=='}' && stack.peek() != '{') return false;
                else if(charArr[i]==']' && stack.peek() != '[') return false;
                else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())return true;
        return false;
    }
}
