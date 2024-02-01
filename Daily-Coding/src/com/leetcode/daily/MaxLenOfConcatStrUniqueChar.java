package com.leetcode.daily;

import java.util.*;

public class MaxLenOfConcatStrUniqueChar {
    public static void main(String[] args) {
        String[] arr = {"un", "iq", "ue"};
       // System.out.println(maxLength(arr));
        System.out.println(maxLengthRecursion(arr));
    }

    // using recursion
    private static int maxLengthRecursion(String [] arr){
        String temp="";
        int len = arr.length;
        int i=0;
        return dfs(arr,i,len,temp);
    }

    private static int dfs(String[] arr, int i, int len, String temp) {
        //base condition
        if(i >= len) return 0;
        int include =0;
        int exclude =0;
        if(hasDuplicate(arr[i], temp)){
            exclude = dfs(arr, i+1, len, temp);
        }
        else{
            exclude = dfs(arr, i+1, len, temp);
            include = dfs(arr, i+1, len, temp+arr[i]);
        }
        return Math.max(include, exclude);
    }

    private static boolean hasDuplicate(String s, String temp) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            //map.put(ch, map.getOrDefault(ch, 0)+1);
            if(map.isEmpty() || !map.containsKey(ch)) map.put(ch, 1);
            else return true;
        }
        for(char ch: temp.toCharArray()){
            if(map.containsKey(ch)) return true;
        }

        return false;
    }

    private static int maxLength(String[] arr) {
        List<String> result = new ArrayList<>();
        int maxLen = 0;
        result.add("");
        for(String word: arr){
            int resltLen = result.size();
            for(int i=0;i<resltLen;i++){
                String newResult = result.get(i)+word;
                Set<Character> set = new HashSet<>();
                for(char c:newResult.toCharArray()){
                    set.add(c);
                }
                if(set.size() != newResult.length()) continue;
                result.add(newResult);
                maxLen = Math.max(maxLen, newResult.length());
            }

        }
        return maxLen;
    }
}
