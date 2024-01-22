package com.leetcode.daily;


// leetcode #1209-  Remove All Adjacent Duplicates in String II
public class RemoveKAdjacentDuplicateFromAString {
    public static void main(String[] args) {
        String s ="deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeDuplicates(s,k));
    }

    private static String removeDuplicates(String s, int k) {
        String s1="";
        while (s.length() !=s1.length()){
            s1 = s;
            s = removeDupUtil(s1, k);
        }
        return s;
    }
    private static String removeDupUtil(String s, int k){
        int n = s.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i<n){
            if(i<n-k && s.charAt(i) == s.charAt(i+1)){
                k--;
                while(k!=0 && i<n-k && s.charAt(i) == s.charAt(i+k)){
                    k--;
                    if(k==0) i = i+k;
                }
            }
            else{
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
