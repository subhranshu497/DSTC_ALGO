package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class StringCompressionII {
    public static void main(String[] args) {
        String s = "llllllllllttttttttt";
        int k = 1;
        System.out.println(getLengthOfOptimalCompression(s, k));
    }

    private static int getLengthOfOptimalCompression(String s, int k) {
        ConcurrentHashMap<Character, Integer> charMap = new ConcurrentHashMap<>();
        for(int i=0;i<s.length();i++){
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i),0)+1);
        }
        //iterate map
        for(char key :charMap.keySet()){
            if(charMap.get(key)<=k && k !=0) {
                k = k - charMap.get(key);
                charMap.remove(key);
            }
        }
        if(k !=0){
            int maxValue = 0;
            char maxKey = 0;
            for(char key :charMap.keySet()){
                if(maxValue < charMap.get(key)){
                    maxValue = Math.max(maxValue, charMap.get(key));
                    maxKey = key;
                }
            }
            charMap.put(maxKey, maxValue-k);
        }
        StringBuilder sb = new StringBuilder();
        for(char key : charMap.keySet()){
            sb.append(key);
            if(charMap.get(key)>1)sb.append(charMap.get(key));
        }
        return sb.length(); // "llllllllllttttttttt"

    }
}
