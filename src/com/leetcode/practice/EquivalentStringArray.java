package com.leetcode.practice;

public class EquivalentStringArray {
    public static void main(String[] args) {
        String [] word1 = {"ab", "c"};
        String [] word2 = {"a", "bc"};
        //System.out.println(checkStringArrayEquality(word1, word2));
        System.out.println(stringArrayOptimized(word1, word2));
    }

    //optimized approach
    private static boolean stringArrayOptimized(String[] word1, String[] word2){
        return String.join("",word1).equals(String.join("", word2));
    }

    private static boolean checkStringArrayEquality(String [] word1, String [] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s1:word1){
            sb1.append(s1);
        }
        for(String s2:word2){
            sb2.append(s2);
        }
        if(sb1.toString().equals(sb2.toString())) {
            return true;
        }
        return false;
    }
}
