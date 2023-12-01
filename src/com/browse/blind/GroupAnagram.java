package com.browse.blind;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagramDetector(strs);
        System.out.println(result);
    }

    private static List<List<String>> groupAnagramDetector(String[] strs) {
        Map<String, List<String>> anaMap = new HashMap<>();
        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            List<String> values = new ArrayList<>();
            anaMap.computeIfAbsent(key, v->new ArrayList<>()).add(str);
        }
        // for final result
        List<List<String>> finalResult = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: anaMap.entrySet()){
            finalResult.add(entry.getValue());
        }
        //return new ArrayList<>(anaMap.values());
        return finalResult;
    }
}
