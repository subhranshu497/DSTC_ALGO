package com.leetcode.daily;

import java.util.Stack;
//Leetcode # 844
public class BackspaceStringCompareIteration {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceString(s,t));
    }

    private static boolean backspaceString(String s, String t) {

        return formString(s).equals(formString(t));

    }
    private static String formString(String s){
        Stack<Character> result = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch !='#') result.push(ch);
            else if(!result.isEmpty())result.pop();
        }
        return String.valueOf(result);
    }
}
