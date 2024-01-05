package com.leetcode.practice;

public class PallindromeCheckIII {
    public static void main(String[] args) {
        String s = "abcdeca";
        int k = 2;
        System.out.println(isValidPallindrome(s,k));
    }

    private static boolean isValidPallindrome(String s, int k) {
        return true;
    }
    private boolean isPallindrome(String s){ //abba     
        int l =0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
