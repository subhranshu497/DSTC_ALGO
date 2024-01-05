package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSub(s,t));
    }

    private static boolean isSub(String s, String t) {
        if(t.isEmpty() ||t == null || t.isBlank() || t.length()<s.length()) return false;
        StringBuilder sb = new StringBuilder();
        int i =0;
        int j =0;
        while(i<t.length() && j<s.length()){
            if(t.charAt(i)==s.charAt(j)){
                sb.append(s.charAt(j));
                j++;
            }
            i++;
        }
        return sb.toString().equals(s);
    }
}
