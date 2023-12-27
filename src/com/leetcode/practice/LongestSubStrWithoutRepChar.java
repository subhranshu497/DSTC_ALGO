package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStrWithoutRepChar {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = nonRepeatingCharLength(s);
        System.out.println(result);
    }

    private static int nonRepeatingCharLength(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left =0;
        int right =0;
        int result = 0;
        int n = s.length();
        while(right <n){
            char r = s.charAt(right);
            map.put(r, map.getOrDefault(r,0)+1);
            while (map.get(r) >1){
                char l = s.charAt(left);
                map.put(l, map.get(l)-1);
                left++;
            }
            result = Math.max(result, right-left+1);
            right++;
        }
        return result;
    }
}
