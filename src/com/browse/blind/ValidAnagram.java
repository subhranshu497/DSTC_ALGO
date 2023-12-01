package com.browse.blind;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagram(s,t));
    }

    private static boolean anagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        for(int i=0;i<schar.length;i++){
            if(schar[i] != tchar[i]) return false;
        }
        return true;
    }
}
