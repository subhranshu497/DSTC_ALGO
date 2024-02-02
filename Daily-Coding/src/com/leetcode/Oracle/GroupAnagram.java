package com.leetcode.Oracle;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res= groupAna(strs);
    }

    private static List<List<String>> groupAna(String[] strs) {
        Map<String, List<String>> anaMap = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String keyStr = String.valueOf(ch);
            if(!anaMap.containsKey(keyStr)) anaMap.put(keyStr, new ArrayList<>());
            anaMap.get(keyStr).add(str);
        }
        return new ArrayList<>(anaMap.values());
    }
}
