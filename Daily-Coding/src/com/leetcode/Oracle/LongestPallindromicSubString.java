package com.leetcode.Oracle;

/**
 * Leetcode # 5
 */
public class LongestPallindromicSubString {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPali(s));
    }

    private static String longestPali(String s) {
        int n = s.length();
        for(int length=n;length>0;length--){
            for(int start = 0; start<=n-length;start++){
                if(pallindromeChecker(s.substring(start,start+length))) return s.substring(start,start+length);
            }
        }
        return "";
    }
    private static boolean pallindromeChecker(String str){
        int i = 0;
        int j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
