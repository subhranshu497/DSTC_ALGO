package com.leetcode.practice;

import java.util.Arrays;

public class ValidAnagramChecker {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagramChecker(s,t));
    }

    private static boolean anagramChecker(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] charArr1 = s.toCharArray();
        char[] charArr2 = t.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        for(int i=0;i<s.length();i++){
            if(charArr1[i] != charArr2[i])return false;
        }
        return true;
    }
}
