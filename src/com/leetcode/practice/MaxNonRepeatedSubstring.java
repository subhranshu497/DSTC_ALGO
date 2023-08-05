package com.leetcode.practice;

import java.util.HashSet;
import java.util.Set;

public class MaxNonRepeatedSubstring {
    public static void main(String[] args) {
        String str = "abcabcb";
        System.out.println(maxSubstringFinderOptimized(str));
    }

    private static int maxSubstringFinderOptimized(String str) {
        int right =0;
        int left =0;
        int max =0;
        Set<Character> set = new HashSet<>();
        while(right < str.length()){
            char c = str.charAt(right);
            if(set.contains(c)){
                while(left < right){
                    if(c == str.charAt(left)){
                        set.remove(str.charAt(left));
                    }
                    left++;
                }

            }
            set.add(c);
            max = Math.max(max, right-left+1);
            right++;
        }

        return max;
    }


}
