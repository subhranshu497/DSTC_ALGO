package com.leetcode.practice;

public class CountOfMatchesInTournament {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(numberOfMatches(n));
    }

    private static int numberOfMatches(int n) {
        int matches = 0;
        int result = 0;
        while(n != 1){
            if(n % 2 !=0) {
                int temp = n-1;
                matches = temp /2;
                result +=matches;
                n = (n+1) /2;
            }
            else{
                n = n /2;

                result +=n;
            }

        }
        return result;
    }
}
