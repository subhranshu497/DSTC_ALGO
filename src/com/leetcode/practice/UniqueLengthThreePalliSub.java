package com.leetcode.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueLengthThreePalliSub {
    public static void main(String[] args) {
        String s = "aabca";
        System.out.println(unique3Palli(s));
    }

    private static int unique3Palli(String s) {
        //take two  map and initialize those with the first and last occerances of the character
        // because in case of 3 char palindraome string, middle char doesnot matter, but first and last char should be same
        // to avoid duplicate, take set and initialize it with all unique char

        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> last = new HashMap<>();
        Set<Character> characters = new HashSet<>();

        // populate first map and character set
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            characters.add(ch);
            if(!first.containsKey(ch)) first.put(ch,i);
        }
        // populate last map and character set
        for(int i=s.length()-1;i>=0;i--){
            Character ch = s.charAt(i);
            if(!last.containsKey(ch)) last.put(ch,i);
        }
        // iterate the unique char set to identify the all unique combinations of palindrome
        int result =0;
        for(Character ch : characters){
            Set<Character> set = new HashSet<>();
            for(int i = first.get(ch)+1;i<=last.get(ch)-1;i++){
                set.add(s.charAt(i));
            }
            result =result+set.size();
        }
        return result;
    }

}
