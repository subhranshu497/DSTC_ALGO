package com.leetcode.practice;

public class MinimumChangesToMakeAlterantiveBinaryString {
    public static void main(String[] args) {
        String s = "1111";
        System.out.println(minOperations(s));
    }

    private static int minOperations(String s) {
        int countOne=0;
        int countZero=0;
        for(int i=0;i<s.length();i++){
            if(i % 2 ==0){
                if(s.charAt(i)=='1') countZero++;
                else countOne++;
            }
            else{
                if(s.charAt(i)=='1') countOne++;
                else countZero++;
            }
        }
        return Math.min(countZero,countOne);
    }
}
