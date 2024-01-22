package com.leetcode.daily;

import java.util.*;

public class DetermineTwoStringsAreClose {
    public static void main(String[] args) {
        String word1 = "aacabb";
        String word2 = "bbcbaa";
        System.out.println(closeStrings(word1,word2));
    }

    private static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<word1.length();i++)
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i),0)+1);
        for(int i=0;i<word2.length();i++)
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i),0)+1);
        if(!map1.keySet().equals(map2.keySet())) return false;
        List<Integer> word1FrqList = new ArrayList<>(map1.values());
        List<Integer> word2FrqList = new ArrayList<>(map2.values());
        Collections.sort(word1FrqList);
        Collections.sort(word2FrqList);
        return word1FrqList.equals(word2FrqList);
    }
}
