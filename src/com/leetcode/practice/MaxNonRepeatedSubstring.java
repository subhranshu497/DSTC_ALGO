package com.leetcode.practice;

public class MaxNonRepeatedSubstring {
    public static void main(String[] args) {
        String str = "abcabcb";
        System.out.println(maxSubstringFinder(str));
    }

    private static int maxSubstringFinder(String str) {
        int left =0;
        int right = 0;
        int result = 0;
        Integer [] chars = new Integer[128];
        while(right < str.length()){
            char r = str.charAt(right);
            Integer index = chars[r];
            if(index !=null && index >=left && index<right) left = index+1;
            result = Math.max(result, right-left+1);
            chars[r] = right;
            right++;
        }
        return result;
    }
}
