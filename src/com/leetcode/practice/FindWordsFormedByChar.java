package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class FindWordsFormedByChar {
    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(wordFormChecker(words, chars));
    }

    private static int wordFormChecker(String[] words, String chars) {
        int result = 0;
        Map<Character, Integer> charFreqMap = new HashMap<>();
        // populate the map
        for(char ch : chars.toCharArray()){
            charFreqMap.put(ch, charFreqMap.getOrDefault(ch,0)+1);
        }
        //iterate the string array
        for(String str : words){
            if(wordChecker(charFreqMap, str)) result +=str.length();
        }
        return result;
    }

    private static boolean wordChecker(Map<Character, Integer> charFreqMap, String str){
        Map<Character, Integer> strArr = new HashMap<>();
        for(char ch : str.toCharArray()){
            strArr.put(ch, strArr.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character, Integer> entry :strArr.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            if(!charFreqMap.containsKey(key) || !(value <=charFreqMap.get(key))){
                return false;
            }
        }
        return true;
    }
}
