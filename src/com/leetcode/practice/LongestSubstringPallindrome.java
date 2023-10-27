package com.leetcode.practice;

public class LongestSubstringPallindrome {
    public static void main(String[] args) {
        String s = "ac";
        System.out.println(longestPalindromeChecker(s));
    }

    private static String longestPalindromeChecker(String s) {
        //iterate the string to both direction from a pivot point
        String lps = "";
        if(s.length()<=1) return s;
            for (int i = 1; i < s.length(); i++) {
                //two pointer for traversing both direction
                int left = i;
                int right = i;
                //check for equlity of char
                while (s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                    if (left == -1 || right == s.length()) break;
                }
                //identify the substring traversed
                String pali = s.substring(left + 1, right);
                //write to the palindromeic string
                if (pali.length() > lps.length()) {
                    lps = pali;
                }
                //check for even length
                left = i-1;
                right = i;
                //check for equlity of char
                while (s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                    if (left == -1 || right == s.length()) break;
                }
                //identify the substring traversed
                pali = s.substring(left+1, right);
                //write to the palindromeic string
                if (pali.length() > lps.length()) {
                    lps = pali;
                }
            }
        return lps;
    }
}
