package com.leetcode.seventyfive;

import java.util.Stack;

public class ReverseWordInAString {
    public static void main(String[] args) {
        String s = "     the sky is blue         ";
//        System.out.println("trimming the spaces"+s.trim());
//        String[] strArr = s.split(" ",-2);
//        for(String str:strArr){
//            System.out.println(str);
//        }
        System.out.println(reverseWord(s));
    }

    private static String reverseWord(String s) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = s.trim().split("\\s+");
        for(int i = strArr.length-1;i>=0;i--){
            sb.append(strArr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
