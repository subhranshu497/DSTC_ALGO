package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharToMakeAllStringEqual {
    public static void main(String[] args) {
        String [] words = {"abc", "aabc", "bc"};
        System.out.println(makeEqual(words));
    }

    private static boolean makeEqual(String[] words) {
        Map<Character, Integer> counts = new HashMap<>();
        for(String word : words){
            for(char c : word.toCharArray()){
                counts.put(c, counts.getOrDefault(c,0)+1);
            }
        }
        for(char key: counts.keySet()){
            if(counts.get(key)%words.length !=0) return false;
        }
        return true;
    }
}
