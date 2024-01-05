package com.leetcode.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class BreakPallindrome {
    public static void main(String[] args) {
        String pallindrome = "aaaaaa";
        System.out.println(brkPalli(pallindrome));
    }

    private static String brkPalli(String pallindrome) {
        if(pallindrome.length()==1) return "";
        char[] charArr = pallindrome.toCharArray();
        for(int i =0;i<pallindrome.length()/2;i++){
            if(pallindrome.charAt(i) != 'a'){
                charArr[i] = 'a';
                return String.valueOf(charArr);
            }
        }
        charArr[charArr.length-1] = 'b';
        return String.valueOf(charArr);
    }
}
