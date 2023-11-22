package com.leetcode.practice;

import java.util.*;

public class SortVowelInAString {
    public static void main(String[] args) {
        String s ="LEetcOde";
        sortVowel(s);
    }

    private static String sortVowel(String s) {
        StringBuilder result = new StringBuilder();
        List<Character> vowelSorted = new ArrayList<>();
        // iterate the string and collect all vowel and sort those and push to stack
        for(char c : s.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1) vowelSorted.add(c);
        }
        Collections.sort(vowelSorted, Collections.reverseOrder());
        // construct the result string
        for(char c : s.toCharArray()){
            if("aeiouAEIOU".indexOf(c) != -1){
                result.append(vowelSorted.get(vowelSorted.size()-1));
                vowelSorted.remove(vowelSorted.size()-1);
            }
            else{
                result.append(c);
            }
        }
        return result.toString();
    }
}
