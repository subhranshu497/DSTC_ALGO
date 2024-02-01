package com.leetcode.seventyfive;
//leetcode #1768
public class MergeStringAlternatively {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately2(word1, word2));
    }

    private static String mergeAlternately2(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        char[] charArr1 = word1.toCharArray();
        char[] charArr2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        String rem = "";
        int n =0;
        if(n1>n2){
            n = n2;
            rem = word1.substring(n2,n1);
        }
        else {
            n =n1;
            rem = word2.substring(n1,n2);
        }
        for(int i=0;i<n;i++){
            sb.append(charArr1[i]);
            sb.append(charArr2[i]);
        }
        if(rem != null)sb.append(rem);
        return sb.toString();
    }
}
