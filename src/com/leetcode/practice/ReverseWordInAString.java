package com.leetcode.practice;

public class ReverseWordInAString {
    public static void main(String[] args) {
        String s = "    the      sky is      blue     ";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] strArr = s.trim().split("\\s+");
        for(int i=strArr.length-1;i>=0;i--){
            sb.append(strArr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
