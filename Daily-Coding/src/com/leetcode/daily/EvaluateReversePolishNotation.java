package com.leetcode.daily;

import java.util.Stack;

/**
 * leetcode 150
 */
public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] exp = {"4","13","5","/","+"};
        System.out.println(evalRPN(exp));
    }

    private static int evalRPN(String[] exp) {
        Stack<Integer> stack = new Stack<>();
        for(String t : exp){
            if("+-*/".contains(t)){
                stack.push(eval(stack.pop(),stack.pop(), t));
            }
            else{
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
    private static int eval(int a, int b, String op){
        if(op.equals("+")) return a + b;
        else if (op.equals("-")) return b - a;
        if(op.equals("*")) return a * b;
        else return b / a;
    }
}
