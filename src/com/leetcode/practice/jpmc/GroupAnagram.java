package com.leetcode.practice.jpmc;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> groupAna = findGroupAna(strs);
        System.out.println(groupAna);
    }

    private static List<List<String>> findGroupAna(String[] strs) {
        Map<String, List<String>> anaMap = new HashMap<>();
        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = String.valueOf(ch);
            if(!anaMap.containsKey(s)) anaMap.put(s,new ArrayList<>());
            anaMap.get(s).add(str);
        }
        return new ArrayList<>(anaMap.values());
    }
}
