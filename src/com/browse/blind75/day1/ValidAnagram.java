package com.browse.blind75.day1;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagramCheckHashtable(s,t));
    }

    private static boolean anagramCheck(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        char[]s2 = t.toCharArray();
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)) return true;
        return false;
    }
    /**
     * using hashtble
     * first put into hashtable
     * remove from hashtable
     * check for values =0
     */
    private static boolean anagramCheckHashtable(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        //enter element to ht
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        // remove from Ht
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)-1);
        }
        for(int value:map.values()){
            if(value !=0) return false;
        }
        return true;
    }
}
