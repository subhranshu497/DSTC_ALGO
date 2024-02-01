package com.leetcode.dynamicPrograming;

/**
 * Leetcode - #1143
 */
public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        System.out.println(lcs(text1, text2));
    }

    private static int lcs(String text1, String text2) {
        int[][]dp = new int[text1.length()+1][text2.length()+1];
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        //to identify the common subseq
        int index = dp[text1.length()][text2.length()];
        StringBuilder sb = new StringBuilder();
        int row = text1.length();
        int col = text2.length();
        while(row > 0 && col > 0){
            if(text1.charAt(row-1)==text2.charAt(col-1)){
                sb.append(text1.charAt(row-1));
                row--;
                col--;
                index--;
            }
            else if(text1.length() > text2.length()) row--;
            else if(text1.length() < text2.length()) col--;
            else {
                row--;
                col--;
            }
        }
        String s = "";
        for(int i=sb.length()-1;i>=0;i--){
            s =s+sb.charAt(i);
        }
        System.out.println(s);
        return dp[text1.length()][text2.length()];
    }
}
