package com.leetcode.seventyfive;

import java.sql.SQLOutput;

//leetcode 1768
public class MergeStringAlt {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    private static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i =0;
        int n =0;
        String sub = null;
        if(word1.length()<word2.length()) {
            n = word1.length();
            sub = word2.substring(word1.length()-1,word2.length());
        }
        else if(word1.length()>word2.length()){
            n = word2.length();
            sub = word1.substring(word2.length()-1,word1.length());
        }
        else n = word1.length();
        while(i<n){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }
        if(sub !=null) sb.append(sub);
        return sb.toString();
    }
}
