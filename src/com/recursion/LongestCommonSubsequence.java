package com.recursion;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GTXAYB";
        int m = s1.length();
        int n = s2.length();

        System.out.println(lcs(s1,s2,m,n));
    }
    //to get the length of longest common substring
    private static int lcs(String s1, String s2, int m, int n) {
        //base condition
        if(m==0 || n==0) return 0;

        if(s1.charAt(m-1) == s2.charAt(n-1)) {
            return 1+lcs(s1,s2,m-1,n-1);
        }
        else{
            return Math.max(lcs(s1,s2,m,n-1), lcs(s1,s2,m-1,n));
        }
    }
}
