package com.browse.blind75.day3;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagramChecker(strs));
    }

    private static List<List<String>> groupAnagramChecker(String[] strs) {
        //take a hashmap
        //iterate the string array , sort each element and then put into hm , key = sorted string, val = string
        //at the end iterate the hm and store the vlaue in a list and return
        Map<String, List<String>> map = new HashMap<>();
        if(strs.length ==0 || strs==null) return new ArrayList<>();
        for(String str : strs){
            char[] chArr =str.toCharArray();
            Arrays.sort(chArr);
            String sortedString = String.valueOf(chArr);
            //Populate the hashmap
            if(!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }
        //iterate the hashmap for the result
        List<List<String>> finalResult = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            finalResult.add(entry.getValue());
        }
        return finalResult;
    }

    private static boolean anagramChecker(String s, String t) {
        char[] ch1 = s.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++){
            if(ch1[i] != ch2[i]) return false;
        }
        return true;
    }
}
