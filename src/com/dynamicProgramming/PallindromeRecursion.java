package com.dynamicProgramming;

public class PallindromeRecursion {
    public static void main(String[] args) {
        String str = "dabjad";
        int left =0;
        int right = str.length()-1;
        System.out.println(pallindromeCheck(str,left,right));
    }

    private static boolean pallindromeCheck(String str,int left, int right) {
        if(left >=right) return true;
        return str.charAt(left)==str.charAt(right) && pallindromeCheck(str,left+1,right-1);
    }
}
