package com.hackerRank.practice;

public class RepeatedString {
    public static void main(String[] args) {
        String s = "aba";
        int n = 10;
        System.out.println(rString(s,n));
    }

    private static int rString(String s, int n) {
        // check for a
        if(!s.contains("a")) return 0;

        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== 'a') count++;
        }
        int rep = n /s.length();
        count = count * rep;
        int rem = n % s.length();
        for(int i =0; i< rem;i++){
            if(s.charAt(i)== 'a') count++;
        }
        return count;
    }
}
