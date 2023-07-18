package com.leetcode.practice;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s= "{]";
       boolean flag = isValidParenthesis(s);
        System.out.println(flag);
    }

    private static boolean isValidParenthesis(String s) {
        Stack<Character> stack= new Stack<>();
        char[] charArr = s.toCharArray();
        char top;
        for(int i=0;i<charArr.length;i++){
            char x = charArr[i];
            if(x=='(' || x=='{'|| x=='['){
                stack.push(x);
                continue;
            }
            if(stack.isEmpty()) return false;
            switch (x){
                case ')':
                    top = stack.pop();
                    if(top == '{' || top == '[') return false;
                    break;
                case '}':
                    top = stack.pop();
                    if(top == '(' || top == '[') return false;
                    break;
                case ']':
                    top = stack.pop();
                    if(top == '(' || top == '{') return false;
                    break;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
