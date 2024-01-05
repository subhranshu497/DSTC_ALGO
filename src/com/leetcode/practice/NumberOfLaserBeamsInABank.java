package com.leetcode.practice;

public class NumberOfLaserBeamsInABank {
    public static void main(String[] args) {
        String [] bank = {"00000","00101","10100","11110","11100","01001","00100","11010"};
        System.out.println(numberOfBeams(bank));
    }

    private static int numberOfBeams(String[] bank) {
        int i =0;
        int j =1;
        int result = 0;
        while(j<bank.length){
            int countOne = countOnes(bank[i]);
            int countOneNext = countOnes(bank[j]);
            if(countOneNext != 0 && countOne !=0){
                result += countOne * countOneNext;
                i =j;
            }
            else if(countOne == 0) i++;
            j++;
        }
        return result;
    }
    private static int countOnes(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '1') count++;
        }
        return count;
    }
}
