package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class LargestSubStringBetweenTwoEqualChar {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }

    private static int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans =-1;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                ans = Math.max(ans, i-map.get(s.charAt(i))-1);
            }
            else{
                map.put(s.charAt(i),i);
            }
        }
        return ans;
    }
}
