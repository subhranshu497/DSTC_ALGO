package com.leetcode.practice;

public class LargestOddNumberInAString {
    public static void main(String[] args) {
        String num = "36";
        System.out.println(largestOddNumber(num));
    }

    private static String largestOddNumber(String num) {
        if((int)num.charAt(num.length()-1)%2==1) return num;
        int i=num.length()-1;
        while(i>=0){
            int n=num.charAt(i);
            if(n%2==1) return num.substring(0,i+1);
            i--;
        }
        return "";
    }
}
